package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IExistsUserConverter;
import com.codegym.bestticket.converter.user.ILoginConverter;
import com.codegym.bestticket.converter.user.IRegisterConverter;
import com.codegym.bestticket.dto.user.UserDto;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.user.EmailAlreadyExistsException;
import com.codegym.bestticket.exception.user.PasswordNotMatchException;
import com.codegym.bestticket.exception.user.PhoneNumberAlreadyExistsException;
import com.codegym.bestticket.exception.user.RoleNotFoundException;
import com.codegym.bestticket.exception.user.UserNotFoundException;
import com.codegym.bestticket.exception.user.UsernameAlreadyExistsException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.LoginGoogleRequest;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.ExistsUserResponse;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import com.codegym.bestticket.payload.response.user.RegisterResponse;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.security.JwtTokenProvider;
import com.codegym.bestticket.service.IUserService;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
@Transactional
public class UserService implements IUserService {
    private final IUserRepository userRepository;
    private final ICustomerRepository customerRepository;
    private final IRoleRepository roleRepository;
    private final IOrganizerRepository organizerRepository;
    private final IRegisterConverter registerConverter;
    private final ILoginConverter loginConverter;
    private final IExistsUserConverter existsUserConverter;
    private final PasswordEncoder encoder;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new GsonFactory();


    @Override
    public ResponsePayload register(RegisterRequest registerRequest) {
        try {
            if (userRepository.existsByUsername(
                    registerRequest.getUsername())) {
                throw new UsernameAlreadyExistsException("Username already exists!");
            }
            if (userRepository.existsByEmail(
                    registerRequest.getEmail())) {
                throw new EmailAlreadyExistsException("Email already exists!");
            }
            String phoneNumber = registerRequest.getPhoneNumber();
            if (phoneNumber != null) {
                if (customerRepository.existsByPhoneNumber(phoneNumber)) {
                    throw new PhoneNumberAlreadyExistsException("Phone number already exists!");
                }
            }
            User user = registerConverter.dtoToEntity(registerRequest);
            user.setOldPassword(user.getPassword());
            user.setPassword(encoder.encode(user.getPassword()));
            user.setIsDeleted(false);
            user.setIsActivated(true);
            Set<Role> roles = new HashSet<>();
            if (registerRequest.getPhoneNumber() != null) {
                roles.add(roleRepository.findByName("CUSTOMER")
                        .orElseThrow(() -> new RoleNotFoundException("Role CUSTOMER not found!")));
            } else {
                roles.add(roleRepository.findByName("USER")
                        .orElseThrow(() -> new RoleNotFoundException("Role USER not found!")));
            }
            user.setRoles(roles);
            userRepository.save(user);
            RegisterResponse registerResponse = registerConverter.entityToDto(user);
            UUID userId = user.getId();
            if (user.getId() == null) {
                throw new UserNotFoundException("User by id not found!");
            }
            if (registerRequest.getPhoneNumber() != null) {
                Customer customer = Customer.builder()
                        .phoneNumber(registerRequest.getPhoneNumber())
                        .user(userRepository.findById(userId).orElse(null))
                        .isDeleted(false)
                        .build();
                customerRepository.save(customer);
            }
            if (!registerRequest.getConfirmPassword().equals(registerRequest.getPassword())) {
                throw new PasswordNotMatchException("Password not match!");
            }
            Set<String> listRole = user.getRoles()
                    .stream()
                    .map(Role::getName)
                    .collect(Collectors.toSet());
            registerResponse.setListRole(listRole);
            return ResponsePayload.builder()
                    .message("Register successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(registerResponse)
                    .build();
        } catch (UsernameAlreadyExistsException | EmailAlreadyExistsException | PhoneNumberAlreadyExistsException e) {
            return ResponsePayload.builder()
                    .message(e.getMessage())
                    .status(HttpStatus.CONFLICT)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Login failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload loginGoogle(LoginGoogleRequest loginGoogleRequest) {
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(HTTP_TRANSPORT, JSON_FACTORY)
                .setAudience(Collections.singletonList(loginGoogleRequest.getClientId()))
                .build();
        GoogleIdToken googleIdToken;
        try {
            googleIdToken = verifier.verify(loginGoogleRequest.getCredential());
        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException(e);
        }
        if (googleIdToken != null) {
            GoogleIdToken.Payload payload = googleIdToken.getPayload();
            String userEmail = payload.getEmail();
            String[] username = userEmail.split("@");
            Optional<User> oldUser = userRepository.findByUsername(username[0]);
            if (oldUser.isPresent()) {
                LoginRequest loginRequest = LoginRequest.builder()
                        .username(oldUser.get().getUsername())
                        .password(oldUser.get().getOldPassword())
                        .build();
                return login(loginRequest);
            } else {
                String email = payload.getEmail();
                boolean emailVerified = payload.getEmailVerified();
                String pictureUrl = (String) payload.get("picture");
                String fullName = (String) payload.get("name");
                String password = ("a119904");
                Set<Role> roleSet = new HashSet<>();
                roleSet.add(roleRepository.findByName("CUSTOMER")
                        .orElseThrow(() -> new RoleNotFoundException("Role CUSTOMER not found!")));
                User user = User.builder()
                        .username(username[0])
                        .password(encoder.encode(password))
                        .email(email)
                        .isActivated(emailVerified)
                        .avatar(pictureUrl)
                        .roles(roleSet)
                        .oldPassword(password)
                        .isDeleted(false)
                        .build();
                userRepository.save(user);
                Customer customer = Customer.builder()
                        .fullName(fullName)
                        .user(user)
                        .isDeleted(false)
                        .build();
                customerRepository.save(customer);
                LoginRequest loginRequest = LoginRequest.builder()
                        .username(user.getUsername())
                        .password(user.getOldPassword())
                        .build();
                return login(loginRequest);
            }
        } else {
            System.out.println("Invalid ID token!");
            return ResponsePayload.builder().status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @Override
    public ResponsePayload login(LoginRequest loginRequest) {
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            User user = userRepository.findByUsername(authentication.getName())
                    .orElseThrow(() -> new UserNotFoundException("User not found!"));
            Set<Role> roles = user.getRoles();
            Set<String> listRoles = new HashSet<>();
            for (Role role : roles) {
                listRoles.add(role.getName());
            }
            String token = jwtTokenProvider.generateToken(authentication);
            user.setRememberToken(token);
            userRepository.save(user);
            LoginResponse loginResponse = loginConverter.entityToDto(user, token);
            if (user.getCustomer() != null) {
                loginResponse.setFullName(user.getCustomer().getFullName());
            }
            loginResponse.setListRole(listRoles);
            return ResponsePayload.builder()
                    .message("Login successfully!!!")
                    .status(HttpStatus.OK)
                    .data(loginResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Login failed!")
                    .status(HttpStatus.UNAUTHORIZED)
                    .build();
        }
    }

    @Override
    public ResponsePayload keepLogin(HttpServletRequest request) {

        try {
            String token = request.getHeader("Authorization").substring(7);
            if (jwtTokenProvider.validateToken(token)) {
                Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                String username = ((org.springframework.security.core.userdetails.User) object).getUsername();
                User user = userRepository.findByUsername(username)
                        .orElseThrow(() -> new UserNotFoundException("User not found"));
                Set<Role> roles = user.getRoles();
                Set<String> listRoles = new HashSet<>();
                for (Role role : roles) {
                    listRoles.add(role.getName());
                }
                LoginResponse loginResponse = loginConverter.entityToDto(user, token);
                loginResponse.setListRole(listRoles);
                if (user.getCustomer() != null) {
                    loginResponse.setFullName(user.getCustomer().getFullName());
                }
                return ResponsePayload.builder()
                        .message("Login successfully")
                        .status(HttpStatus.OK)
                        .data(loginResponse)
                        .build();
            }
        } catch (Exception ignored) {
        }
        return ResponsePayload.builder()
                .message("Not accepted !")
                .status(HttpStatus.UNAUTHORIZED)
                .data(null)
                .build();
    }


    @Override
    public ResponsePayload logout(HttpServletRequest request) {
        try {
            String token = request.getHeader("Authorization").substring(7);
            SecurityContextHolder.clearContext();
            User user = userRepository.findUserByRememberToken(token)
                    .orElseThrow(() -> new UserNotFoundException("User not found!"));
            if (user != null) {
                user.setRememberToken(null);
                userRepository.save(user);
            }
            return ResponsePayload.builder()
                    .message("Logout successfully!!!")
                    .status(HttpStatus.OK)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("User not found!")
                    .status(HttpStatus.UNAUTHORIZED)
                    .build();
        }
    }

    @Override
    public ResponsePayload delete(UUID id) {
        try {
            User user = userRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("User is not found"));
            user.setIsDeleted(true);
            userRepository.save(user);
            return ResponsePayload.builder()
                    .message("User deleted!!!")
                    .status(HttpStatus.OK)
                    .build();
        } catch (EntityNotFoundException e) {
            return ResponsePayload.builder()
                    .message("User not found or is deleted!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload findById(UUID id) throws AccessDeniedException {
        try {
            UserDetails userDetails =
                    (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            User user = userRepository.findById(id)
                    .orElseThrow(() -> new UserNotFoundException("User not found!"));
            if (!user.getUsername().equals(userDetails.getUsername())) {
                throw new AccessDeniedException("Unauthorized access!");
            }
            Customer customer = customerRepository.findByUserId(id).orElse(null);
            Organizer organizer = organizerRepository.findByUserId(id).orElse(null);
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setUsername(user.getUsername());
            userDto.setEmail(user.getEmail());
            userDto.setCustomer(customer);
            userDto.setOrganizer(organizer);
            return ResponsePayload.builder()
                    .message("User!")
                    .status(HttpStatus.OK)
                    .data(userDto)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("User not found!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload showExistsUsers() {
        try {
            List<User> user = userRepository.findAllByIsDeletedFalse();
            List<ExistsUserResponse> existsUserResponses =
                    user.stream()
                            .map(existsUserConverter::mapToExistsUsers)
                            .collect(Collectors.toList());
            return ResponsePayload.builder()
                    .message("User list!!!")
                    .status(HttpStatus.OK)
                    .data(existsUserResponses)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("User list not found")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public Optional<User> findUserByRememberToken(String token) {
        return userRepository.findUserByRememberToken(token);
    }

    @Override
    public ResponsePayload filterUsers(Pageable pageable, String status, String filterType) {
        try {
            Iterable<User> result;
            switch (filterType) {
                case "username":
                    result = userRepository.searchUserByIsDeletedFalseAndUsernameContaining(pageable, status);
                    break;
                case "role":
                    Role role = new Role(status);
                    result = userRepository.searchUserByIsDeletedFalseAndRolesContaining(pageable, status, String.valueOf(role));
                    break;
                case "customer":
                    result = userRepository.searchUserByIsDeletedFalseAndCustomerFullNameContaining(pageable, status);
                    break;
                case "organizer":
                    result = userRepository.searchUserByIsDeletedFalseAndOrganizerNameContaining(pageable, status);
                    break;
                case "organizerType":
                    result = organizerRepository.searchUserByIsDeletedFalseAndOrganizerTypeContaining(pageable, status);
                    break;
                case "created":
                    result = userRepository.searchUserByIsDeletedFalseAndCreatedContaining(pageable, status);
                    break;
                case "active":
                    result = userRepository.searchUserByIsDeletedFalseAndIsActivatedContaining(pageable, status);
                    break;
                default:
                    return null;
            }
            if (!result.iterator().hasNext()) {
                return ResponsePayload.builder()
                        .message("List user not found!")
                        .status(HttpStatus.NOT_FOUND)
                        .build();
            }
            Iterable<User> sortedUser = StreamSupport.stream(result.spliterator(), false)
                    .sorted(Comparator.comparing(User::getCreated).reversed())
                    .collect(Collectors.toList());
            return ResponsePayload.builder()
                    .message("List users")
                    .status(HttpStatus.OK)
                    .data(sortedUser)
                    .build();
        } catch (EntityNotFoundException e) {
            return ResponsePayload.builder()
                    .message("FAILED")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
}




package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.ILoginConverter;
import com.codegym.bestticket.converter.user.IRegisterConverter;
import com.codegym.bestticket.converter.user.IUserConverter;
import com.codegym.bestticket.dto.user.UserDto;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.EmailAlreadyExistsException;
import com.codegym.bestticket.exception.PhoneNumberAlreadyExistsException;
import com.codegym.bestticket.exception.UserNotFoundException;
import com.codegym.bestticket.exception.UsernameAlreadyExistsException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import com.codegym.bestticket.payload.response.user.RegisterResponse;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.security.JwtTokenProvider;
import com.codegym.bestticket.service.IUserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashSet;
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
    private final IUserConverter userConverter;
    private final IRegisterConverter registerConverter;
    private final ILoginConverter loginConverter;
    private final PasswordEncoder encoder;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

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
            if (customerRepository.existsByPhoneNumber(
                    registerRequest.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExistsException("Phone number already exists!");
            }

            User user = registerConverter.dtoToEntity(registerRequest);
            user.setPassword(encoder.encode(user.getPassword()));
            user.setIsDeleted(false);
            user.setIsActivated(true);
            Set<Role> roles = new HashSet<>();
            if (registerRequest.getPhoneNumber() != null) {
                roles.add(roleRepository.findByName("CUSTOMER")
                        .orElseThrow(() -> new RuntimeException("Can not find ROLE_CUSTOMER!")));
            } else {
                roles.add(roleRepository.findByName("USER")
                        .orElseThrow(() -> new RuntimeException("Can not find ROLE_USER!")));
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
                throw new RuntimeException("Password not match!");
            }
            return ResponsePayload.builder()
                    .message("Register successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(registerResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Register failed")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
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
            User user = userRepository.findByUsername(authentication.getName());
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
    public ResponsePayload logout(HttpServletRequest request) {
        String token = request.getHeader("Authorization").substring(7);

        SecurityContextHolder.clearContext();
        User user = userRepository.findUserByRememberToken(token);
        if (user != null) {
            user.setRememberToken(null);
            userRepository.save(user);
            return ResponsePayload.builder()
                    .message("Logout successfully!!!")
                    .status(HttpStatus.OK)
                    .build();
        }
        return ResponsePayload.builder()
                .message("User not found!")
                .status(HttpStatus.UNAUTHORIZED)
                .build();
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
    public ResponsePayload findAll(Pageable pageable) {
        try {
            Page<User> users = userRepository.findAllByIsDeletedFalse(pageable);
            Page<UserDto> userDtos = users.map(user -> {
                UserDto userDto = userConverter.entityToDto(user);
                Customer customer = customerRepository.findByUserIdAndIsDeletedFalse(userDto.getId())
                        .orElse(null);
                userDto.setCustomer(customer);
                Organizer organizer = organizerRepository.findByUserIdAndIsDeletedFalse(userDto.getId())
                        .orElse(null);
                userDto.setOrganizer(organizer);
                return userDto;
            });
            return ResponsePayload.builder()
                    .message("User list!!!")
                    .status(HttpStatus.OK)
                    .data(userDtos)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("User list not found")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
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
                    return findAll(pageable);
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




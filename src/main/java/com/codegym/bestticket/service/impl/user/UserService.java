package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.ILoginConverter;
import com.codegym.bestticket.converter.user.IRegisterConverter;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.DeleteUserException;
import com.codegym.bestticket.exception.EmailAlreadyExistsException;
import com.codegym.bestticket.exception.InvalidUserException;
import com.codegym.bestticket.exception.InvalidPasswordException;
import com.codegym.bestticket.exception.LoginFailedException;
import com.codegym.bestticket.exception.RegisterFailedException;
import com.codegym.bestticket.exception.UsernameAlreadyExistsException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import com.codegym.bestticket.payload.response.user.RegisterResponse;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IUserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class UserService implements IUserService {
    private final IUserRepository userRepository;
    private final ICustomerRepository customerRepository;
    private final IRegisterConverter registerConverter;
    private final ILoginConverter loginConverter;

    @Override
    public ResponsePayload register(RegisterRequest registerRequest) {
        try {
            if (userRepository.existsByUsername(
                    registerRequest.getUsername())) {
                throw new UsernameAlreadyExistsException("Username already exists.");
            }
            if (userRepository.existsByEmail(
                    registerRequest.getEmail())) {
                throw new EmailAlreadyExistsException("Email already exists.");
            }
            User user = registerConverter.dtoToEntity(registerRequest);
            user.setIsDeleted(false);
            userRepository.save(user);
            RegisterResponse registerResponse = registerConverter.entityToDto(user);
            return ResponsePayload.builder()
                    .message("Register successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(registerResponse)
                    .build();
        } catch (RegisterFailedException e) {
            return ResponsePayload.builder()
                    .message("Register failed")
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }
    }

    @Override
    public ResponsePayload login(LoginRequest loginRequest) {
        try
        {
            User user = userRepository.findByUsername(loginRequest.getUsername());
            if (user == null) {
                user = userRepository.findByEmail(loginRequest.getEmail());
            }
            if (user == null) {
                user = customerRepository.findByPhoneNumber(loginRequest.getPhoneNumber()).getUser();
            }
            if (user == null) {
                throw new InvalidUserException("Username/Email/Phone number is not blank.");
            }
            String password = loginRequest.getPassword();
            if (password == null || password.isEmpty()) {
                throw new InvalidPasswordException("Password is not blank.");
            }
            if (!password.equals(user.getPassword())) {
                throw new InvalidPasswordException("Password is incorrect.");
            }
            LoginResponse loginResponse = loginConverter.entityToDto(user);
            return ResponsePayload.builder()
                .message("Login successfully!!!")
                    .status(HttpStatus.OK)
                    .data(loginResponse)
                    .build();
        } catch (LoginFailedException e){
            return ResponsePayload.builder()
                    .message("Login failed.")
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }

    }

    @Override
    public ResponsePayload delete(UUID id) {
        try{
            User user = userRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("User is not found"));
            user.setIsDeleted(true);
            userRepository.save(user);
            return ResponsePayload.builder()
                    .message("User deleted!!!")
                    .status(HttpStatus.OK)
                    .build();
        }catch (DeleteUserException e){
            return ResponsePayload.builder()
                    .message("User not found or is deleted!")
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }

    }


}



package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.ILoginConverter;
import com.codegym.bestticket.converter.user.IRegisterConverter;
import com.codegym.bestticket.converter.user.impl.LoginConverter;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.EmailAlreadyExistsException;
import com.codegym.bestticket.exception.EmailNotFoundException;
import com.codegym.bestticket.exception.InvalidPasswordException;
import com.codegym.bestticket.exception.PhoneNumberAlreadyExistsException;
import com.codegym.bestticket.exception.UsernameAlreadyExistsException;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import com.codegym.bestticket.payload.response.user.RegisterResponse;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IUserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class UserService implements IUserService {
    private final IUserRepository userRepository;
    private final IRegisterConverter registerConverter;
    private final ILoginConverter loginConverter;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        if (userRepository.existsByUsername(
                registerRequest.getUsername())) {
            throw new UsernameAlreadyExistsException("Username already exists.");
        }
        if (userRepository.existsByEmail(
                registerRequest.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists.");
        }
        if (userRepository.existsByPhoneNumber(
                registerRequest.getPhoneNumber())) {
            throw new PhoneNumberAlreadyExistsException("Phone number already exists.");
        }
        User user = registerConverter.dtoToEntity(registerRequest);
        user.setIsDeleted(false);
        userRepository.save(user);
        return registerConverter.entityToDto(user);
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        User user = userRepository.findByEmail(loginRequest.getEmail());
        if (user == null) {
            user = userRepository.findByPhoneNumber(loginRequest.getPhoneNumber());
        }
        if (user == null) {
            throw new EmailNotFoundException("Email not found.");
        }
        String password = loginRequest.getPassword();
        if (password == null || password.isEmpty()) {
            throw new InvalidPasswordException("Password is not blank.");
        }
        if (!password.equals(user.getPassword())) {
            throw new InvalidPasswordException("Password is incorrect.");
        }
        return loginConverter.entityToDto(user);
    }

    @Override
    public void remove(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User is not found"));
        user.setIsDeleted(true);
        userRepository.save(user);
    }

    @Override
    public void delete(UUID id) {
        userRepository.deleteById(id);
    }

}



package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.LoginConverter;
import com.codegym.bestticket.converter.user.RegisterConverter;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.response.user.LoginDtoResponse;
import com.codegym.bestticket.dto.response.user.RegisterDtoResponse;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.EmailAlreadyExistsException;
import com.codegym.bestticket.exception.EmailNotFoundException;
import com.codegym.bestticket.exception.InvalidPasswordException;
import com.codegym.bestticket.exception.PhoneNumberAlreadyExistsException;
import com.codegym.bestticket.exception.UsernameAlreadyExistsException;
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
    private final RegisterConverter registerConverter;
    private final LoginConverter loginConverter;

    @Override
    public RegisterDtoResponse register(RegisterDtoRequest registerDtoRequest) {
        if (userRepository.existsByUsername(
                registerDtoRequest.getUsername())) {
            throw new UsernameAlreadyExistsException("Username already exists.");
        }
        if (userRepository.existsByEmail(
                registerDtoRequest.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists.");
        }
        if (userRepository.existsByPhoneNumber(
                registerDtoRequest.getPhoneNumber())) {
            throw new PhoneNumberAlreadyExistsException("Phone number already exists.");
        }
        User user = registerConverter.dtoToEntity(registerDtoRequest);
        userRepository.save(user);
        return registerConverter.entityToDto(user);
    }

    @Override
    public LoginDtoResponse login(LoginDtoRequest loginDtoRequest) {
        User user = userRepository.findByEmail(loginDtoRequest.getEmail());
        if (user == null) {
            user = userRepository.findByPhoneNumber(loginDtoRequest.getPhoneNumber());
        }
        if (user == null) {
            throw new EmailNotFoundException("Email not found.");
        }
        String password = loginDtoRequest.getPassword();
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



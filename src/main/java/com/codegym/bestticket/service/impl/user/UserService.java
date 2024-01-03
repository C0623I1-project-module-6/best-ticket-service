package com.codegym.bestticket.service.impl.user;

<<<<<<< HEAD
import com.codegym.bestticket.converter.user.impl.LoginConverter;
import com.codegym.bestticket.converter.user.impl.RegisterConverter;
import com.codegym.bestticket.dto.request.user.LoginRequestDTO;
import com.codegym.bestticket.dto.request.user.RegisterRequestDTO;
import com.codegym.bestticket.dto.response.user.LoginResponseDTO;
import com.codegym.bestticket.dto.response.user.RegisterResponseDTO;
=======
import com.codegym.bestticket.converter.user.LoginConverter;
import com.codegym.bestticket.converter.user.RegisterConverter;
import com.codegym.bestticket.payload.request.user.LoginRequestDTO;
import com.codegym.bestticket.payload.request.user.RegisterRequestDTO;
import com.codegym.bestticket.payload.response.user.LoginResponseDTO;
import com.codegym.bestticket.payload.response.user.RegisterResponseDTO;
>>>>>>> b443a7ace48527560c855f611c0b22a40f4cbd0b
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
    public RegisterResponseDTO register(RegisterRequestDTO registerRequestDTO) {
        if (userRepository.existsByUsername(
                registerRequestDTO.getUsername())) {
            throw new UsernameAlreadyExistsException("Username already exists.");
        }
        if (userRepository.existsByEmail(
                registerRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists.");
        }
        if (userRepository.existsByPhoneNumber(
                registerRequestDTO.getPhoneNumber())) {
            throw new PhoneNumberAlreadyExistsException("Phone number already exists.");
        }
        User user = User.builder()
                .email(registerRequestDTO.getEmail())
                .isDeleted(false)
                .build();
        userRepository.save(user);
        return registerConverter.entityToDto(user);
    }

    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        User user = userRepository.findByEmail(loginRequestDTO.getEmail());
        if (user == null) {
            user = userRepository.findByPhoneNumber(loginRequestDTO.getPhoneNumber());
        }
        if (user == null) {
            throw new EmailNotFoundException("Email not found.");
        }
        String password = loginRequestDTO.getPassword();
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



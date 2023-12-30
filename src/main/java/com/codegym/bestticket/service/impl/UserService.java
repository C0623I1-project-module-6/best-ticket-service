package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.converter.user.UserConverter;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.repository.IUserRepository;
import com.codegym.bestticket.service.IUserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
    private final IUserRepository iUserRepository;
    private final UserConverter userConverter;

    @Override
    public ResponseDto register(RegisterDtoRequest registerDtoRequest) {
        User user = userConverter.dtoToEntity(registerDtoRequest);
        iUserRepository.save(user);
        userConverter.entityToDto(user);
        return new ResponseDto(user);
    }

    @Override
    public ResponseDto login(LoginDtoRequest loginDtoRequest) {
        String password = loginDtoRequest.getPassword();
        if (password != null) {
            User user = iUserRepository.findByPhoneNumber(loginDtoRequest.getPhoneNumber());
            if (user != null) {
                if (password.equals(user.getPassword())) {
                    userConverter.entityToDto(user);
                }
            }
        }
        return new ResponseDto(HttpStatus.OK);
    }

    @Override
    public void remove(UUID id) {
        User user= iUserRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("User is not found"));
        iUserRepository.delete(user);
    }

}



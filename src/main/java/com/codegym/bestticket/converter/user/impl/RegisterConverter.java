package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IRegisterConverter;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.request.user.RegisterRequestDTO;
import com.codegym.bestticket.payload.response.user.RegisterResponseDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RegisterConverter implements IRegisterConverter {
    public RegisterResponseDTO entityToDto(User user) {
        RegisterResponseDTO registerResponseDTO = new RegisterResponseDTO();
        BeanUtils.copyProperties(user, registerResponseDTO);
        return registerResponseDTO;
    }

    public User dtoToEntity(RegisterRequestDTO registerRequestDTO) {
        User user = new User();
        BeanUtils.copyProperties(registerRequestDTO, user);
        return user;
    }

}

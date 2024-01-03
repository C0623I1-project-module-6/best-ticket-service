package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.payload.request.user.RegisterRequestDTO;
import com.codegym.bestticket.payload.response.user.RegisterResponseDTO;
import com.codegym.bestticket.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RegisterConverter {
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

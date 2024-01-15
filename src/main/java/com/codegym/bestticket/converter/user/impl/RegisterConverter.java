package com.codegym.bestticket.converter.user.impl;


import com.codegym.bestticket.converter.user.IRegisterConverter;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.RegisterResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class RegisterConverter implements IRegisterConverter {

    public RegisterResponse entityToDto(User user) {
        RegisterResponse registerResponse = new RegisterResponse();
        BeanUtils.copyProperties(user, registerResponse);
        return registerResponse;
    }

    public User dtoToEntity(RegisterRequest registerRequest) {
        User user = new User();
        BeanUtils.copyProperties(registerRequest, user);
        return user;
    }
}

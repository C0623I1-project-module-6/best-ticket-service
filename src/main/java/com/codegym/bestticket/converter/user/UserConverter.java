package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public RegisterDtoRequest entityToDto(User user) {
        RegisterDtoRequest registerDtoRequest = new RegisterDtoRequest();
        BeanUtils.copyProperties(user, registerDtoRequest);
        return registerDtoRequest;
    }

    public User dtoToEntity(RegisterDtoRequest registerDtoRequest) {
        User user = new User();
        BeanUtils.copyProperties(registerDtoRequest, user);
        return user;
    }
}

package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.response.user.RegisterDtoResponse;
import com.codegym.bestticket.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RegisterConverter {
    public RegisterDtoResponse entityToDto(User user) {
        RegisterDtoResponse registerDtoResponse = new RegisterDtoResponse();
        BeanUtils.copyProperties(user, registerDtoResponse);
        return registerDtoResponse;
    }

    public User dtoToEntity(RegisterDtoRequest registerDtoRequest) {
        User user = new User();
        BeanUtils.copyProperties(registerDtoRequest, user);
        return user;
    }

}

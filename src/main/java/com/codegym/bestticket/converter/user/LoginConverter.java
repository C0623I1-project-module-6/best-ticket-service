package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.payload.response.user.LoginResponse;
import com.codegym.bestticket.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LoginConverter {
    public LoginResponse entityToDto(User user){
        LoginResponse loginResponse =new LoginResponse();
        BeanUtils.copyProperties(user, loginResponse);
        return loginResponse;
    }
}

package com.codegym.bestticket.converter.user.impl;


import com.codegym.bestticket.converter.user.ILoginConverter;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component

public class LoginConverter implements ILoginConverter {

    public LoginResponse entityToDto(User user, String token, String refreshToken) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setListRole(user.getRoles());
        loginResponse.setToken(token);
        loginResponse.setRefreshToken(user.getRefreshToken().getRefreshToken());
        BeanUtils.copyProperties(user, loginResponse);
        return loginResponse;
    }
}


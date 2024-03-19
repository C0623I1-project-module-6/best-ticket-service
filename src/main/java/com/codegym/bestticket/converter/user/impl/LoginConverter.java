package com.codegym.bestticket.converter.user.impl;


import com.codegym.bestticket.converter.user.ILoginConverter;
import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component

public class LoginConverter implements ILoginConverter {

    public LoginResponse entityToDto(User user) {
        LoginResponse loginResponse = new LoginResponse();
        BeanUtils.copyProperties(user, loginResponse);
        return loginResponse;
    }
}


package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.response.user.LoginDtoResponse;
import com.codegym.bestticket.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LoginConverter {
    public LoginDtoResponse entityToDto(User user){
        LoginDtoResponse loginDtoResponse=new LoginDtoResponse();
        BeanUtils.copyProperties(user,loginDtoResponse);
        return loginDtoResponse;
    }
}

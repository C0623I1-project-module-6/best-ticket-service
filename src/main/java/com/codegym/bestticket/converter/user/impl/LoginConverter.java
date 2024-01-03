package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.ILoginConverter;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.LoginResponseDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LoginConverter implements ILoginConverter {
    public LoginResponseDTO entityToDto(User user) {
        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        BeanUtils.copyProperties(user, loginResponseDTO);
        return loginResponseDTO;
    }
}

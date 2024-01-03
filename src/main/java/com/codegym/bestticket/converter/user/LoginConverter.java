package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.response.user.LoginResponseDTO;
import com.codegym.bestticket.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LoginConverter {
    public LoginResponseDTO entityToDto(User user){
        LoginResponseDTO loginResponseDTO =new LoginResponseDTO();
        BeanUtils.copyProperties(user, loginResponseDTO);
        return loginResponseDTO;
    }
}

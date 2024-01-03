package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.LoginResponseDTO;

public interface ILoginConverter {
    LoginResponseDTO entityToDto(User user);
}

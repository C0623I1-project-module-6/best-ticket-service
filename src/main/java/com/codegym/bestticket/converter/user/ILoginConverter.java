package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.LoginResponse;

public interface ILoginConverter {
    LoginResponse entityToDto(User user, String token,String refreshToken);
}

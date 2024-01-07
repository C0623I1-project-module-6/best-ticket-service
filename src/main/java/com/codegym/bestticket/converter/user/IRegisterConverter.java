package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.RegisterResponse;

import java.util.List;

public interface IRegisterConverter {
    RegisterResponse entityToDto(User user, List<String> userRoles);

    User dtoToEntity(RegisterRequest registerRequest);
}

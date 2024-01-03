package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.request.user.RegisterRequestDTO;
import com.codegym.bestticket.payload.response.user.RegisterResponseDTO;

public interface IRegisterConverter {
    RegisterResponseDTO entityToDto(User user);
    User dtoToEntity(RegisterRequestDTO registerRequestDTO);
}

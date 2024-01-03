package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.user.LoginRequestDTO;
import com.codegym.bestticket.payload.request.user.RegisterRequestDTO;
import com.codegym.bestticket.payload.response.user.LoginResponseDTO;
import com.codegym.bestticket.payload.response.user.RegisterResponseDTO;

import java.util.UUID;

public interface IUserService {
    RegisterResponseDTO register(RegisterRequestDTO registerRequestDTO);
    LoginResponseDTO login(LoginRequestDTO loginRequestDTO);
    void remove(UUID id);
    void delete(UUID id);
}


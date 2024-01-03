package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import com.codegym.bestticket.payload.response.user.RegisterResponse;

import java.util.UUID;

public interface IUserService {
    RegisterResponse register(RegisterRequest registerRequest);
    LoginResponse login(LoginRequest loginRequest);
    void remove(UUID id);
    void delete(UUID id);
}


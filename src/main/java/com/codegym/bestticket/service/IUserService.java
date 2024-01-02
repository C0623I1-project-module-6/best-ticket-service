package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.response.user.LoginDtoResponse;
import com.codegym.bestticket.dto.response.user.RegisterDtoResponse;

import java.util.UUID;

public interface IUserService {
    RegisterDtoResponse register(RegisterDtoRequest registerDtoRequest);
    LoginDtoResponse login(LoginDtoRequest loginDtoRequest);
    void remove(UUID id);
    void delete(UUID id);
}


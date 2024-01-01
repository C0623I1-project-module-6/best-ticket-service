package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.dto.response.user.LoginDtoResponse;

import java.util.UUID;

public interface IUserService {
    ResponseDto register(RegisterDtoRequest registerDtoRequest);
    LoginDtoResponse login(LoginDtoRequest loginDtoRequest);
    void remove(UUID id);
    void delete(UUID id);
}


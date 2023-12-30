package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;

import java.util.UUID;

public interface IUserService {
    ResponseDto register(RegisterDtoRequest registerDtoRequest);
    ResponseDto login(LoginDtoRequest loginDtoRequest);
    void remove(UUID id);
}


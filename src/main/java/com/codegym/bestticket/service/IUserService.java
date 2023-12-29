package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;

public interface IUserService {
    ResponseDto register(RegisterDtoRequest registerDtoRequest);
    ResponseDto login(LoginDtoRequest loginDtoRequest);
}


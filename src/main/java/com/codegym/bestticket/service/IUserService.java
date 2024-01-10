package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;

import java.util.UUID;

public interface IUserService {
    ResponsePayload register(RegisterRequest registerRequest);

    ResponsePayload login(LoginRequest loginRequest);
    ResponsePayload logout(UUID id);

    ResponsePayload delete(UUID id);




}


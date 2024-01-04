package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IUserService {
    ResponsePayload register(RegisterRequest registerRequest);
    ResponsePayload login(LoginRequest loginRequest);
    ResponsePayload delete(UUID id);

    ResponsePayload findAll(Pageable pageable);

}


package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.LoginGoogleRequest;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;

import java.nio.file.AccessDeniedException;
import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    ResponsePayload register(RegisterRequest registerRequest);
    ResponsePayload loginGoogle(LoginGoogleRequest loginGoogleRequest);
    ResponsePayload login(LoginRequest loginRequest);
    ResponsePayload keepLogin(HttpServletRequest request);
    ResponsePayload logout(HttpServletRequest request);
    ResponsePayload delete(UUID id);
    ResponsePayload findById(UUID id) throws AccessDeniedException;
    ResponsePayload showExistsUsers();
    Optional<User> findUserByRememberToken(String token);
    ResponsePayload filterUsers(Pageable pageable, String status, String filterType);


}


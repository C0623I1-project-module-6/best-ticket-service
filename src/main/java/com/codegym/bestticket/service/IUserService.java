package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.SendEmailRequest;
import com.codegym.bestticket.payload.request.VerifyOtpRequest;
import com.codegym.bestticket.payload.request.user.LoginGoogleRequest;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import jakarta.servlet.http.HttpServletRequest;

import java.nio.file.AccessDeniedException;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface IUserService {
    ResponsePayload register(RegisterRequest registerRequest);
    void existsUser(RegisterRequest registerRequest);
    Set<Role> setRoleForUser(RegisterRequest registerRequest);
    void checkPhoneNumberForCustomer(RegisterRequest registerRequest);

    ResponsePayload loginGoogle(LoginGoogleRequest loginGoogleRequest);

    ResponsePayload login(LoginRequest loginRequest);

    ResponsePayload keepLogin(HttpServletRequest request);

    ResponsePayload logout(HttpServletRequest request);

    ResponsePayload delete(UUID id);

    ResponsePayload findById(UUID id) throws AccessDeniedException;

    ResponsePayload showExistsUsers();

    Optional<User> findUserByRememberToken(String token);

    ResponsePayload sendOtpAndSaveToDatabase(SendEmailRequest sendEmailRequest);

    ResponsePayload verifyOtpAndResetPassword(VerifyOtpRequest verifyOtpRequest);

    void saveToDatabase(String email, String otp);

    ResponsePayload lockUser(UUID id);

    ResponsePayload unlockUser(UUID id);


}


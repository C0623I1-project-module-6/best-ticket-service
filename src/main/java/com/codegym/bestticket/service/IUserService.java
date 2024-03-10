package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.SendEmailRequest;
import com.codegym.bestticket.payload.request.VerifyValidationCodeRequest;
import com.codegym.bestticket.payload.request.user.LoginGoogleRequest;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.request.user.UnlockUserRequest;
import jakarta.servlet.http.HttpServletRequest;

import java.nio.file.AccessDeniedException;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface IUserService {
    ResponsePayload register(RegisterRequest registerRequest);
    String generateDefaultAvatar(String username) throws NoSuchAlgorithmException;

    void existsUser(RegisterRequest registerRequest);

    Set<Role> setRoleForUser(RegisterRequest registerRequest);

    void checkPhoneNumberForCustomer(RegisterRequest registerRequest);

    ResponsePayload loginGoogle(LoginGoogleRequest loginGoogleRequest);

    ResponsePayload login(LoginRequest loginRequest);

    ResponsePayload keepLogin(HttpServletRequest request);

    ResponsePayload logout(HttpServletRequest request);

    ResponsePayload delete();

    ResponsePayload findById(UUID id) throws AccessDeniedException;

    ResponsePayload showExistsUsers();

    Optional<User> findUserByRememberToken(String token);

    ResponsePayload sendValidationCodeAndSaveToDatabase(SendEmailRequest sendEmailRequest);

    ResponsePayload verifyValidationCodeAndResetPassword(VerifyValidationCodeRequest verifyValidationCodeRequest);

    void saveToDatabase(String email, String otp);

    ResponsePayload lockUser();

    ResponsePayload unlockUser(UnlockUserRequest unlockUserRequest);



}


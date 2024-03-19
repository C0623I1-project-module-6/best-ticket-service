package com.codegym.bestticket.controller;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.SendEmailRequest;
import com.codegym.bestticket.payload.request.VerifyValidationCodeRequest;
import com.codegym.bestticket.payload.request.user.LoginGoogleRequest;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.security.JwtTokenProvider;
import com.codegym.bestticket.service.IUserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final IUserService userService;
    private final JwtTokenProvider tokenProvider;

    @PostMapping("/register")
    public ResponseEntity<ResponsePayload> register(@Valid @RequestBody RegisterRequest registerRequest) {
        if (registerRequest == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        ResponsePayload responsePayload = userService.register(registerRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PostMapping("/google-login")
    public ResponseEntity<ResponsePayload> loginGoogle(@Valid @RequestBody LoginGoogleRequest loginGoogleRequest) {
        if (loginGoogleRequest == null) {
            new ResponseEntity<>("Request not found", HttpStatus.BAD_REQUEST);
        }
        assert loginGoogleRequest != null;
        ResponsePayload responsePayload = userService.loginGoogle(loginGoogleRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PostMapping("/login")
    public ResponseEntity<ResponsePayload> login(HttpServletRequest request,
                                                 @Valid @RequestBody(required = false) LoginRequest loginRequest) {
        try {
            ResponsePayload responsePayload;
            if (loginRequest == null) {
                responsePayload = userService.keepLogin(request);
            } else {
                responsePayload = userService.login(loginRequest);
            }
            return new ResponseEntity<>(responsePayload, responsePayload.getStatus());

        } catch (Exception e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message(e.getMessage())
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<ResponsePayload> logout(HttpServletRequest request) {
        return new ResponseEntity<>(userService.logout(request), HttpStatus.OK);
    }

    @PostMapping("/send-validation-code")
    public ResponseEntity<ResponsePayload> sendOtp(@RequestBody SendEmailRequest sendEmailRequest) {
        if (sendEmailRequest == null) {
            new ResponseEntity<>("Request not found", HttpStatus.BAD_REQUEST);
        }
        ResponsePayload responsePayload = userService.sendValidationCodeAndSaveToDatabase(sendEmailRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<ResponsePayload> forgotPassword(@RequestBody VerifyValidationCodeRequest verifyValidationCodeRequest) {
        if (verifyValidationCodeRequest == null) {
            new ResponseEntity<>("Request not found", HttpStatus.BAD_REQUEST);
        }
        ResponsePayload responsePayload = userService.verifyValidationCodeAndResetPassword(verifyValidationCodeRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }
}

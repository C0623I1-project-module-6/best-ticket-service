package com.codegym.bestticket.controller;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.LoginRequest;
import com.codegym.bestticket.payload.request.user.RegisterRequest;
import com.codegym.bestticket.payload.response.user.LoginResponse;
import com.codegym.bestticket.payload.response.user.RegisterResponse;
import com.codegym.bestticket.service.IUserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final IUserService iUserService;

    @PostMapping("/register")
    public ResponseEntity<ResponsePayload> register(@RequestBody RegisterRequest registerRequest) {
        try {
            if (registerRequest == null) {
                return new ResponseEntity<>(
                        ResponsePayload.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            RegisterResponse registerResponse = iUserService.register(registerRequest);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Register successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(registerResponse)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Register failed!!!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<ResponsePayload> login(@RequestBody LoginRequest loginRequest) {
        try {
            if (loginRequest == null) {
                return new ResponseEntity<>(
                        ResponsePayload.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            LoginResponse loginResponse = iUserService.login(loginRequest);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Login successfully!!!")
                            .status(HttpStatus.OK)
                            .data(loginResponse)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Login failed!!!")
                            .status(HttpStatus.UNAUTHORIZED)
                            .build(),
                    HttpStatus.UNAUTHORIZED);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponsePayload> disableUser(@PathVariable UUID id) {
        try {
            iUserService.remove(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("User disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("User not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponsePayload> deleteUser(@PathVariable UUID id) {
        try {
            iUserService.delete(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("User disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("User not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

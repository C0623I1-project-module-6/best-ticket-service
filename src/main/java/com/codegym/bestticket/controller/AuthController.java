package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.dto.response.user.LoginDtoResponse;
import com.codegym.bestticket.service.IUserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@CrossOrigin("*")
@RequestMapping("/api/users")
@AllArgsConstructor
public class AuthController {
    private final IUserService iUserService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDto> register(@RequestBody RegisterDtoRequest registerDtoRequest) {
        if (registerDtoRequest == null) {
            return new ResponseEntity<>(
                    new ResponseDto("Request not found!!!",
                            HttpStatus.BAD_REQUEST,
                            null), HttpStatus.BAD_REQUEST);
        }
        ResponseDto responseDto = iUserService.register(registerDtoRequest);
        return new ResponseEntity<>(
                new ResponseDto("Register Successfully!!!",
                        HttpStatus.CREATED,
                        responseDto.getData()), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDto> login(@RequestBody LoginDtoRequest loginDtoRequest) {
        try {
            if (loginDtoRequest == null) {
                return new ResponseEntity<>(
                        new ResponseDto("Request not found!!!",
                                HttpStatus.BAD_REQUEST,
                                null), HttpStatus.BAD_REQUEST);
            }
            LoginDtoResponse loginDtoResponse = iUserService.login(loginDtoRequest);
            return new ResponseEntity<>(
                    new ResponseDto("Login Successfully!!!",
                            HttpStatus.OK,
                            loginDtoResponse), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Login failed",
                            HttpStatus.UNAUTHORIZED), HttpStatus.UNAUTHORIZED);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponseDto> disableUser(@PathVariable UUID id) {
        try {
            iUserService.remove(id);
            return new ResponseEntity<>(
                    new ResponseDto("User deleted!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("User not found",
                            HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteUser(@PathVariable UUID id) {
        try {
            iUserService.delete(id);
            return new ResponseEntity<>(
                    new ResponseDto("User deleted!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("User not found or is deleted",
                            HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
        }
    }
}

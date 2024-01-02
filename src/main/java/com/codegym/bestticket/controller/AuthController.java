package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.response.user.LoginDtoResponse;
import com.codegym.bestticket.dto.response.user.RegisterDtoResponse;
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
    public ResponseEntity<ResponseDto> register(@RequestBody RegisterDtoRequest registerDtoRequest) {
      try{
          if (registerDtoRequest == null) {
              return new ResponseEntity<>(
                      ResponseDto.builder()
                              .message("Request not found!")
                              .status(HttpStatus.BAD_REQUEST)
                              .build(),
                      HttpStatus.BAD_REQUEST);
          }
          RegisterDtoResponse registerDtoResponse = iUserService.register(registerDtoRequest);
          return new ResponseEntity<>(
                  ResponseDto.builder()
                          .message("Register successfully!!!")
                          .status(HttpStatus.CREATED)
                          .data(registerDtoResponse)
                          .build(),
                  HttpStatus.CREATED);
      }catch (RuntimeException e){
          return new ResponseEntity<>(
                  ResponseDto.builder()
                          .message("Register failed!!!")
                          .status(HttpStatus.BAD_REQUEST)
                          .build(),
                  HttpStatus.BAD_REQUEST);
      }
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDto> login(@RequestBody LoginDtoRequest loginDtoRequest) {
        try {
            if (loginDtoRequest == null) {
                return new ResponseEntity<>(
                        ResponseDto.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            LoginDtoResponse loginDtoResponse = iUserService.login(loginDtoRequest);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Login successfully!!!")
                            .status(HttpStatus.OK)
                            .data(loginDtoResponse)
                            .build(),
                    HttpStatus.CREATED);
        }catch (RuntimeException e){
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Login failed!!!")
                            .status(HttpStatus.UNAUTHORIZED)
                            .build(),
                    HttpStatus.UNAUTHORIZED);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponseDto> disableUser(@PathVariable UUID id) {
        try {
            iUserService.remove(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("User disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("User not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteUser(@PathVariable UUID id) {
        try {
            iUserService.delete(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("User disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("User not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

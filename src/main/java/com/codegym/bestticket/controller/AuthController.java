package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.dto.response.user.LoginDtoResponse;
import com.codegym.bestticket.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/api/users")
@AllArgsConstructor
public class AuthController {
    private final IUserService iUserService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDto> register(@RequestBody RegisterDtoRequest registerDtoRequest) {
        if (registerDtoRequest == null) {
            return new ResponseEntity<>(new ResponseDto("Request not found!!!", HttpStatus.BAD_REQUEST, null), HttpStatus.BAD_REQUEST);
        }
        ResponseDto responseDto = iUserService.register(registerDtoRequest);
        return new ResponseEntity<>(new ResponseDto("Register Successfully!!!", HttpStatus.CREATED, responseDto), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDto> login(@RequestBody LoginDtoRequest loginDtoRequest) {
        if (loginDtoRequest == null) {
            return new ResponseEntity<>(new ResponseDto("Request not found!!!", HttpStatus.BAD_REQUEST, null), HttpStatus.BAD_REQUEST);
        }
        ResponseDto responseDto = iUserService.login(loginDtoRequest);
        return new ResponseEntity<>(new ResponseDto("Login successfully!!!", HttpStatus.OK,responseDto), HttpStatus.OK);
    }
}

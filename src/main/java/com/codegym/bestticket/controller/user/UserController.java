package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserController {
    private final IUserRepository userRepository;
    private final IUserService userService;


    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> deleteUser(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found.", HttpStatus.NOT_FOUND);
        }
        ResponsePayload responsePayload = userService.delete(id);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

}

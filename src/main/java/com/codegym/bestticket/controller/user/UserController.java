package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserController {
    private final IUserService userService;

//    @GetMapping()
//    public ResponseEntity<ResponsePayload> shows(Pageable pageable) {
//        return new ResponseEntity<>(userService.findAll(pageable), HttpStatus.OK);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.NOT_FOUND);
        }
        ResponsePayload responsePayload = userService.delete(id);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

}

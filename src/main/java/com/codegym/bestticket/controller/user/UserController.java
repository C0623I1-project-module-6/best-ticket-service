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

import java.nio.file.AccessDeniedException;
import java.util.UUID;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserController {
    private final IUserService userService;

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.NOT_FOUND);
        }
        ResponsePayload responsePayload = userService.delete(id);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @GetMapping("/exists")
    public ResponseEntity<ResponsePayload> showValidateExists() {
        return new ResponseEntity<>(userService.showExistsUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getInfo(@PathVariable UUID id) throws AccessDeniedException {
        ResponsePayload responsePayload = userService.findById(id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

}

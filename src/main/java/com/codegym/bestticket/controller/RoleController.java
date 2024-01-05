package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IRoleService;
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
@AllArgsConstructor
@RequestMapping("/api/roles")
public class RoleController {
    private final IRoleService roleService;

    @PostMapping("/")
    public ResponseEntity<ResponsePayload> add(@RequestBody RoleDto roleDto) {
        if (roleDto == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(roleService.create(roleDto), HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ResponsePayload> edit(@PathVariable UUID id,
                                                @RequestBody RoleDto roleDto) {
        if (roleDto == null && id == null) {
            new ResponseEntity<>("Request not found or id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(roleService.update(id, roleDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> deleteRole(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(roleService.delete(id), HttpStatus.OK);
    }
}

package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.RoleDTO;
import com.codegym.bestticket.service.IRoleService;
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
@AllArgsConstructor
@RequestMapping("/api/roles")
public class RoleController {
    private final IRoleService roleService;

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addRole(@RequestBody RoleDTO roleDTO) {
        try {
            if (roleDTO == null) {
                return new ResponseEntity<>(
                        ResponseDto.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            RoleDTO resultRoleDTO = roleService.create(roleDTO);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add role successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(resultRoleDTO)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add role failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponseDto> disableRole(@PathVariable UUID id) {
        try {
            roleService.remove(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Role disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Role not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteRole(@PathVariable UUID id) {
        try {
            roleService.delete(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Role deleted!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Role not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

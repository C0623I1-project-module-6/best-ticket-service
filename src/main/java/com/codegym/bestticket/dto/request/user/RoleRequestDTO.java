package com.codegym.bestticket.dto.request.user;

import lombok.Data;

import java.util.UUID;

@Data
public class RoleRequestDTO {
    private UUID id;
    private String name;
}

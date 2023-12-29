package com.codegym.bestticket.dto.request.user;

import lombok.Data;

import java.util.UUID;

@Data
public class EnterpriseRegisterRequest {
    private String username;
    private String password;
    private UUID user;
}

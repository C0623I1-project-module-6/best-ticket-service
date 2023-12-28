package com.codegym.bestticket.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class EnterpriseRegisterResponse {
    private UUID id;
    private String username;
    private UUID user;
}

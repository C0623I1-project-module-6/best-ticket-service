package com.codegym.bestticket.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class IndividualRegisterResponse {
    private UUID id;
    private String username;
    private UUID user;

}

package com.codegym.bestticket.payload.request;

import lombok.Data;

import java.util.UUID;

@Data
public class BankAccountRequest {
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branch;
    private UUID user;
}

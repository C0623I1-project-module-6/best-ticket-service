package com.codegym.bestticket.dto.user;

import lombok.Data;

import java.util.UUID;

@Data
public class BankAccountDto {
    private UUID id;
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branch;
    private UUID user;
}

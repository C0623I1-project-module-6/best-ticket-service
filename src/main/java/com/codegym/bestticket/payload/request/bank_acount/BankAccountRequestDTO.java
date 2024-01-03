package com.codegym.bestticket.payload.request.bank_acount;

import lombok.Data;

import java.util.UUID;

@Data
public class BankAccountRequestDTO {
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branch;
    private UUID user;
}

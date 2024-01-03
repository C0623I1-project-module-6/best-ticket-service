package com.codegym.bestticket.payload.response;

import com.codegym.bestticket.entity.user.User;
import lombok.Data;

import java.util.UUID;

@Data
public class BankAccountResponse {
    private UUID id;
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branch;
    private User user;
}

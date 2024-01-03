package com.codegym.bestticket.payload.request.user;

import com.codegym.bestticket.entity.user.User;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
public class BankAccountRequest {
    private UUID id;
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branch;
    private UUID user;
}

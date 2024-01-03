package com.codegym.bestticket.dto.response.user;

import com.codegym.bestticket.entity.user.User;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BankAccountResponseDTO {
    private UUID id;
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branch;
    private User user;
}

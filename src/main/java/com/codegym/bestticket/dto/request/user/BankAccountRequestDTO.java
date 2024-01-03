package com.codegym.bestticket.dto.request.user;

import com.codegym.bestticket.entity.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BankAccountRequestDTO {
    private UUID id;
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branch;
    private User user;
}

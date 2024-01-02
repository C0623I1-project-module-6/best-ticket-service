package com.codegym.bestticket.dto.request.contract;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class ContractRequestDTO {
    private UUID id;
    private String date;
    private Double total_amount;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Customer customer;
    private Organizer organizer;
    private Boolean isDeleted;
}
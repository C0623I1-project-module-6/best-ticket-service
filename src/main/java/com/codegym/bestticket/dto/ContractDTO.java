package com.codegym.bestticket.dto;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Enterprise;
import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class ContractDTO {
    private UUID id;
    private String Date;
    private Double amount;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Customer customer;
    private Enterprise organizer;
}

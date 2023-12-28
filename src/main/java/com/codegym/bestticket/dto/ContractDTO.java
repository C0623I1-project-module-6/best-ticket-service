package com.codegym.bestticket.dto;

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
    private UUID customerId;
    private UUID organizerId;
}

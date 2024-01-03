package com.codegym.bestticket.payload.response.contract;

import com.codegym.bestticket.entity.user.customer.Customer;
import com.codegym.bestticket.entity.user.organizer.Organizer;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class ContractResponse {
    private UUID id;
    private String Date;
    private Double totalAmount;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Customer customer;
    private Organizer organizer;
    private Boolean isDeleted;
}

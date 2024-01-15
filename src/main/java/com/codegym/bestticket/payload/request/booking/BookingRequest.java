package com.codegym.bestticket.payload.request.booking;

import com.codegym.bestticket.entity.user.Customer;

import lombok.Data;
import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BookingRequest {
    private UUID id;
    private Double totalAmount;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Customer customer;
    private Boolean isDeleted;
}

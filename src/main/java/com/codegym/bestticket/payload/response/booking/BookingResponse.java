package com.codegym.bestticket.payload.response.booking;


import com.codegym.bestticket.entity.user.Customer;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BookingResponse {
    private UUID id;
    private Double totalAmount;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Customer customer;
    private String userEmail;
    private Boolean isDeleted;
}

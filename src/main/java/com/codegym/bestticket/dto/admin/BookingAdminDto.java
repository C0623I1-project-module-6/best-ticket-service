package com.codegym.bestticket.dto.admin;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BookingAdminDto {
    private String organizeName;
    private UUID organizeId;
    private String customerName;
    private UUID customerId;
    private UUID id;
    private Double totalAmount;
    private Timestamp createdAt;
    private String status;
}

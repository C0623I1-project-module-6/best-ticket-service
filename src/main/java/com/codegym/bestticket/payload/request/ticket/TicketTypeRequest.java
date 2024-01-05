package com.codegym.bestticket.payload.request.ticket;

import lombok.Data;

import java.util.UUID;

@Data
public class TicketTypeRequest {
    private UUID id;

    private String name;

    private Boolean isDeleted;

    private Integer quantity;

    private Double price;
}

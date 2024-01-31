package com.codegym.bestticket.payload.response.ticket;

import lombok.Data;

import java.util.UUID;

@Data
public class TicketTypeResponse {
    private UUID id;

    private String name;

    private Boolean isDeleted;

    private Integer quantity;

    private Double price;
}

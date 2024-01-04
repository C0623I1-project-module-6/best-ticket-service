package com.codegym.bestticket.payload.request.ticket;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
public class TicketTypeRequest {
    private UUID id;
    private String name;
    private Double price;
    private Boolean isDeleted;
}

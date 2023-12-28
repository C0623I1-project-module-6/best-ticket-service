package com.codegym.bestticket.dto.request.ticket_type;

import lombok.Data;

import java.util.UUID;

@Data
public class TicketTypeRequestDTO {
    private UUID id;
    private String name;
    private Double price;
    private Boolean isDelete;
}

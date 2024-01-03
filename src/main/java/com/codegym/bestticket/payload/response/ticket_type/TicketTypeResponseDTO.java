package com.codegym.bestticket.payload.response.ticket_type;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketTypeResponseDTO {
    private UUID id;
    private String name;
    private Double price;
//    private Boolean isDeleted;
}

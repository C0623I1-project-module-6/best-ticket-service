package com.codegym.bestticket.dto.request.ticket_type;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketTypeRequestDTO {
    private UUID id;
    private String name;
    private Double price;
//    private Boolean isDelete;
}

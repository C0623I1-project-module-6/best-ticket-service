package com.codegym.bestticket.dto.response.ticket_type;

import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Data;

import java.util.UUID;

@Data
public class TicketTypeResponseDTO {
    private UUID id;
    private String name;
    private Double price;
    private Boolean isDelete;
}

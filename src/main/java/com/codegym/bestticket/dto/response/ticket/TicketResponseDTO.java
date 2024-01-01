package com.codegym.bestticket.dto.response.ticket;

import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketResponseDTO {
    private UUID id;

    private String ticketCode;

    private String seat;

    private String time;

    private String location;

    private String promotion;

    private String barcode;

    private Boolean isDelete;
    private TicketType ticketType;
}

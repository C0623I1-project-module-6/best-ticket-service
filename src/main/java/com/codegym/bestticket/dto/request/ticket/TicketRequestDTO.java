package com.codegym.bestticket.dto.request.ticket;

import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketRequestDTO {
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

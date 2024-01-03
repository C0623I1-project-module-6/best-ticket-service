package com.codegym.bestticket.payload.request.ticket;

import com.codegym.bestticket.entity.contract.ContractDetail;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
public class TicketRequest {
    private UUID id;

    private String ticketCode;

    private String seat;

    private String time;

    private String location;

    private String promotion;

    private String barcode;

    private Boolean isDeleted;

    private TicketType ticketType;

    private String status;

    private ContractDetail contractDetail;

    private Event event;

}

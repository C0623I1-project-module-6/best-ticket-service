package com.codegym.bestticket.payload.request.ticket;


import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.event.EventTime;
import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Data;

import java.util.UUID;

@Data
public class TicketRequest {
    private UUID id;

    private String ticketCode;

    private String seat;

    private String promotion;

    private Boolean isDeleted;

    private String status;

    private String description;

    private TicketType ticketType;

    private BookingDetail bookingDetail;

    private EventTime eventTime;

}

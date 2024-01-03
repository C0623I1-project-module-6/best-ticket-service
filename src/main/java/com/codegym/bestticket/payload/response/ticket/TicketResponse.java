package com.codegym.bestticket.payload.response.ticket;

import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketResponse {
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

    private BookingDetail bookingDetail;
}

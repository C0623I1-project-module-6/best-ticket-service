package com.codegym.bestticket.payload.response.ticket;


import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.event.EventTime;
import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Data;

import java.util.UUID;

@Data
public class TicketInBookingDetailResponse {
    private UUID id;

    private UUID bookingDetailId;

    private String ticketCode;

    private String seat;

    private String promotion;

    private Boolean isDeleted;

    private String status;

    private String ticketTypeName;

    private Double ticketTypePrice;

    private Time time;

}

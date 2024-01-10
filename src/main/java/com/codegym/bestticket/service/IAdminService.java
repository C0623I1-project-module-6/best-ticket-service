package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAdminService {
    ResponsePayload showBookings(Pageable pageable);
    ResponsePayload showTickets(Pageable pageable);
    ResponsePayload showUsers(Pageable pageable);
    ResponsePayload showEvents(Pageable pageable);
}

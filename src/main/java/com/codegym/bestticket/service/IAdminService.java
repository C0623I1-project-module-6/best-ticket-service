package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAdminService {
    Page<Booking> showBookings(Pageable pageable);
    Page<Ticket> showTickets(Pageable pageable);
    Page<User> showUsers(Pageable pageable);
    Page<Event> showEvents(Pageable pageable);
}

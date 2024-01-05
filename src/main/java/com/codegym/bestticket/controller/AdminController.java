package com.codegym.bestticket.controller;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IAdminService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@AllArgsConstructor
@CrossOrigin("*")
public class AdminController {
    private final IAdminService adminService;

    @GetMapping("/bookings")
    public ResponseEntity<ResponsePayload> showBookings(@PageableDefault(size = 5) Pageable pageable) {
        Page<Booking> bookings = adminService.showBookings(pageable);
        return new ResponseEntity<>(
                ResponsePayload
                        .builder()
                        .status(HttpStatus.OK)
                        .data(bookings)
                        .build(),
                HttpStatus.OK);
    }

    @GetMapping("/tickets")
    public ResponseEntity<ResponsePayload> showTicket(@PageableDefault(size = 5) Pageable pageable) {
        Page<Ticket> tickets = adminService.showTickets(pageable);
        return new ResponseEntity<>(
                ResponsePayload
                        .builder()
                        .status(HttpStatus.OK)
                        .data(tickets)
                        .build(),
                HttpStatus.OK);

    }


}

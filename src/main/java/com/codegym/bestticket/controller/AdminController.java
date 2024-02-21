package com.codegym.bestticket.controller;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IAdminService;
import lombok.AllArgsConstructor;
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


    @GetMapping("/users")
    public ResponseEntity<ResponsePayload> showUsers(@PageableDefault(size = 8) Pageable pageable) {
        ResponsePayload responsePayload = adminService.showUsers(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }
    @GetMapping("/events")
    public ResponseEntity<ResponsePayload> showEvents(@PageableDefault(size = 8) Pageable pageable) {
        ResponsePayload responsePayload = adminService.showEvents(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/bookings")
    public ResponseEntity<ResponsePayload> showBookings(@PageableDefault(size = 8) Pageable pageable) {
        ResponsePayload responsePayload = adminService.showBookings(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/tickets")
    public ResponseEntity<ResponsePayload> showTicket(@PageableDefault(size = 5) Pageable pageable) {
        ResponsePayload responsePayload = adminService.showTickets(pageable);
        return new ResponseEntity<>(
                ResponsePayload
                        .builder()
                        .status(HttpStatus.OK)
                        .data(responsePayload)
                        .build(),
                HttpStatus.OK);

    }
}

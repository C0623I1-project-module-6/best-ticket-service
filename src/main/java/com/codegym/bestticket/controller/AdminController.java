package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IAdminService;
import com.codegym.bestticket.service.IOrganizerTypeService;
import com.codegym.bestticket.service.IRoleService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/admin")
@AllArgsConstructor
@CrossOrigin("*")
public class AdminController {
    private final IAdminService adminService;


    @GetMapping("/users")
    public ResponseEntity<ResponsePayload> shows(@PageableDefault(size = 8) Pageable pageable) {
        System.out.println("Check git commit choi choi");
        ResponsePayload responsePayload = adminService.showUsers(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }
    @GetMapping("/bookings")
    public ResponseEntity<ResponsePayload> showBookings(@PageableDefault(size = 8) Pageable pageable) {
        ResponsePayload responsePayload = adminService.showBookings(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/tickets")
    public ResponseEntity<ResponsePayload> showTicket(@PageableDefault(size = 5) Pageable pageable) {

        return new ResponseEntity<>(
                ResponsePayload
                        .builder()
                        .status(HttpStatus.OK)
                        .data(null)
                        .build(),
                HttpStatus.OK);

    }
}

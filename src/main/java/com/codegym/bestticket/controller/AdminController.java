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
@RequestMapping("/api/admins")
@AllArgsConstructor
@CrossOrigin("*")
public class AdminController {
    private final IAdminService adminService;
    private final IRoleService roleService;
    private final IOrganizerTypeService organizerTypeService;

    @GetMapping("/user")
    public ResponseEntity<ResponsePayload> shows(Pageable pageable) {
        return new ResponseEntity<>(adminService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/filter")
    public ResponseEntity<ResponsePayload> filterUsers(@PageableDefault Pageable pageable,
                                                       @RequestParam("status") String status,
                                                       @RequestParam("filterType") String filterType) {
        return new ResponseEntity<>(adminService.filterUsers(pageable, status, filterType), HttpStatus.OK);
    }

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

    @PostMapping("organizer-type/add")
    public ResponseEntity<ResponsePayload> add(@RequestBody OrganizerTypeDto organizerTypeDto) {
        if (organizerTypeDto == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerTypeService.create(organizerTypeDto), HttpStatus.CREATED);
    }

    @DeleteMapping("organizer-type/{id}")
    public ResponseEntity<ResponsePayload> deleteOrganizerType(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.OK);
        }
        return new ResponseEntity<>(organizerTypeService.delete(id), HttpStatus.NOT_FOUND);
    }

    @PostMapping("/role/add")
    public ResponseEntity<ResponsePayload> add(@RequestBody RoleDto roleDto) {
        if (roleDto == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(roleService.create(roleDto), HttpStatus.CREATED);
    }

    @PostMapping("/role/{id}")
    public ResponseEntity<ResponsePayload> edit(@PathVariable UUID id,
                                                @RequestBody RoleDto roleDto) {
        if (roleDto == null && id == null) {
            new ResponseEntity<>("Request not found or id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(roleService.update(id, roleDto), HttpStatus.OK);
    }

    @DeleteMapping("/role/{id}")
    public ResponseEntity<ResponsePayload> deleteRole(@Valid @PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(roleService.delete(id), HttpStatus.OK);
    }

}

package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IAdminService;
import com.codegym.bestticket.service.IRoleService;
import com.codegym.bestticket.service.IUserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/admin")
@AllArgsConstructor
@CrossOrigin("*")
public class AdminController {
    private final IAdminService adminService;
    private final IRoleService roleService;
    private final IUserService userService;


    @GetMapping("/users")
    public ResponseEntity<ResponsePayload> shows(@PageableDefault(size = 5) Pageable pageable) {
        ResponsePayload responsePayload = adminService.showUsers(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.NOT_FOUND);
        }
        ResponsePayload responsePayload = userService.delete(id);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
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

    @GetMapping("/bookings")
    public ResponseEntity<ResponsePayload> showBookings(@PageableDefault(size = 5) Pageable pageable) {
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

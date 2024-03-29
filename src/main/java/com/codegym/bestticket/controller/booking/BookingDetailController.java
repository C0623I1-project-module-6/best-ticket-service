package com.codegym.bestticket.controller.booking;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingDetailRequest;
import com.codegym.bestticket.service.IBookingDetailService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@CrossOrigin(value = "*")
@Log
@RestController
@RequestMapping("/api/bookings/{ignoredBookingId}/booking-details")
public class BookingDetailController {
    private final IBookingDetailService bookingDetailService;

    @GetMapping
    public ResponseEntity<ResponsePayload> getBookingDetailsByBookingIdAndIsDeletedFalse(@PathVariable UUID ignoredBookingId, @PageableDefault Pageable pageable) {
        ResponsePayload responsePayload = bookingDetailService.findAllByBookingIdAndIsDeletedFalse(ignoredBookingId, pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getBookingDetailId(@PathVariable UUID ignoredBookingId, @PathVariable UUID id) {
        ResponsePayload responsePayload = bookingDetailService.findById(id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PostMapping
    public ResponseEntity<ResponsePayload> addBookingDetail(@PathVariable UUID ignoredBookingId, @RequestBody BookingDetailRequest bookingDetailRequest) {
        ResponsePayload responsePayload = bookingDetailService.save(null, bookingDetailRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> updateBookingDetail(@PathVariable UUID ignoredBookingId, @PathVariable UUID id, @RequestBody BookingDetailRequest bookingDetailRequest) {
        ResponsePayload responsePayload = bookingDetailService.save(id, bookingDetailRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> removeBookingDetail(@PathVariable UUID ignoredBookingId, @PathVariable UUID id) {
        ResponsePayload responsePayload = bookingDetailService.remove(id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }
}

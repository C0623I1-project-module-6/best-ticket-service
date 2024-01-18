package com.codegym.bestticket.controller.booking;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.service.IBookingService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@CrossOrigin(value = "*")
@Log
@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final IBookingService bookingService;

    @GetMapping
    public ResponseEntity<ResponsePayload> getBookingListByCustomerIdAndIsDeletedFalse(@PageableDefault Pageable pageable) {
        ResponsePayload responsePayload = bookingService.findAllByIsDeletedFalse(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<ResponsePayload> getBookingListByCustomerIdAndIsDeletedFalse(@PathVariable UUID customerId, @PageableDefault Pageable pageable) {
        ResponsePayload responsePayload = bookingService.findAllByCustomerIdAndIsDeletedFalse(customerId, pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getBooking(@PathVariable UUID id) {
        ResponsePayload responsePayload = bookingService.findById(id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addBooking(@RequestBody BookingRequest bookingRequest) {
        ResponsePayload responsePayload = bookingService.save(bookingRequest, null);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> updateBooking(@PathVariable UUID id, @RequestBody BookingRequest bookingRequest) {
        ResponsePayload responsePayload = bookingService.save(bookingRequest, id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
        ResponsePayload responsePayload = bookingService.remove(id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/event/{eventId}/search")
    public ResponseEntity<ResponsePayload> searchBooking(
            @PathVariable("eventId") UUID eventId,
            @RequestParam("keyword") String keyword,
            @PageableDefault Pageable pageable) {
        ResponsePayload responsePayload = bookingService.search(eventId, keyword, pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<ResponsePayload> findAllByEventId(@PathVariable UUID eventId, Pageable pageable) {
        ResponsePayload responsePayload = bookingService.findAllByEventId(eventId, pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }
}

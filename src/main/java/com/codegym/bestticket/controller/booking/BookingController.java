package com.codegym.bestticket.controller.booking;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import com.codegym.bestticket.service.IBookingService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
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

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;

@AllArgsConstructor
@CrossOrigin(value = "*")
@Log
@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final IBookingService bookingService;

    @GetMapping
    public ResponseEntity<ResponsePayload> getBookingList() {
        ResponsePayload responsePayload = ResponsePayload.builder()
                .message("Fetch data successfully.")
                .status(HttpStatus.OK)
                .data(bookingService.findAll())
                .build();
        return ResponseEntity.ok(responsePayload);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getBooking(@PathVariable UUID id) {
        Optional<BookingResponse> bookingResponseOptional = bookingService.findById(id);
        if (bookingResponseOptional.isPresent()) {
            ResponsePayload responsePayload = ResponsePayload.builder()
                    .message("Booking found.")
                    .status(HttpStatus.OK)
                    .data(bookingResponseOptional)
                    .build();
            return ResponseEntity.ok(responsePayload);
        } else {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("Booking not found.")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addBooking(@RequestBody BookingRequest bookingRequest) {
        try {
            bookingService.save(bookingRequest, null);
            return ResponseEntity.ok(ResponsePayload.builder()
                    .message("Add successfully.")
                    .status(HttpStatus.OK)
                    .data(bookingRequest)
                    .build());
        } catch (Exception e) {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("An error occurred while adding the booking.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponsePayload> updateBooking(@PathVariable UUID id, @RequestBody BookingRequest bookingRequest) {
        try {
            Optional<BookingResponse> bookingOptional = bookingService.findById(id);
            if (bookingOptional.isPresent()) {
                bookingService.save(bookingRequest, id);
                Optional<BookingResponse> updatedBooking = bookingService.findById(id);
                ResponsePayload responsePayload = ResponsePayload.builder()
                        .message("Update successfully.")
                        .status(HttpStatus.OK)
                        .data(updatedBooking)
                        .build();
                return ResponseEntity.ok(responsePayload);
            } else {
                ResponsePayload errorResponse = ResponsePayload.builder()
                        .message("Update failed. Booking not found.")
                        .status(HttpStatus.NOT_FOUND)
                        .build();
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
            }
        } catch (Exception e) {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("An error occurred while updating the booking.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
            bookingService.remove(id);
        if (bookingService.findById(id).isEmpty()) {
            return ResponseEntity.ok(ResponsePayload.builder()
                    .message("Remove successfully.")
                    .status(HttpStatus.OK)
                    .build());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponsePayload.builder()
                            .message("Booking not found.")
                            .status(HttpStatus.NOT_FOUND)
                            .build());
        }
    }

    @GetMapping("/search/keyword?={input}")
    public ResponseEntity<ResponsePayload> search(@PathVariable String input) {
        ResponsePayload responsePayload = ResponsePayload.builder()
                .message("Test")
                .data(bookingService.searchByInput(input))
                .status(HttpStatus.OK)
                .build();
        return ResponseEntity.ok(responsePayload);
    }
}

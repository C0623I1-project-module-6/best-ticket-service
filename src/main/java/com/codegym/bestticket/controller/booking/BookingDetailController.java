package com.codegym.bestticket.controller.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingDetailRequest;
import com.codegym.bestticket.payload.response.booking.BookingDetailResponse;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import com.codegym.bestticket.service.IBookingDetailService;
import com.codegym.bestticket.service.IBookingService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
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
@RequestMapping("/api/bookings/{bookingId}/booking-details")
public class BookingDetailController {
    private final IBookingService bookingService;
    private final IBookingDetailService bookingDetailService;

    @GetMapping
    public ResponseEntity<ResponsePayload> getBookingDetailsByBookingId(@PathVariable UUID bookingId) {
        Iterable<BookingDetailResponse> bookingDetailResponses = bookingDetailService.findAllByBookingId(bookingId);
        ResponsePayload responsePayload = ResponsePayload.builder()
                .message("Fetch data successfully")
                .status(HttpStatus.OK)
                .data(bookingDetailResponses)
                .build();
        return ResponseEntity.ok(responsePayload);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getBookingDetail(@PathVariable UUID bookingId, @PathVariable UUID id) {
        Optional<BookingDetailResponse> bookingDetailResponseDTO = bookingDetailService.findByBookingIdAndId(bookingId, id);
        if (bookingDetailResponseDTO.isPresent() && !bookingDetailResponseDTO.get().getIsDeleted()) {
            ResponsePayload responsePayload = ResponsePayload.builder()
                    .message("Booking detail found.")
                    .status(HttpStatus.OK)
                    .data(bookingDetailResponseDTO)
                    .build();
            return ResponseEntity.ok(responsePayload);
        } else {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("Booking detail not found")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addBookingDetail(@PathVariable UUID bookingId, @RequestBody BookingDetailRequest bookingDetailRequest) {
       return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponsePayload> updateBookingDetail(@PathVariable UUID bookingId, @PathVariable UUID id, @RequestBody BookingDetailRequest bookingDetailRequest) {
        try {
            Optional<BookingDetailResponse> bookingDetailResponse = bookingDetailService.findByBookingIdAndId(bookingId, id);
            if (bookingDetailResponse.isPresent()) {
                bookingDetailRequest.setId(id);
                bookingDetailService.save(bookingDetailRequest);
                Optional<BookingDetailResponse> updatedBookingDetail = bookingDetailService.findByBookingIdAndId(bookingId, id);
                ResponsePayload responsePayload = ResponsePayload.builder()
                        .message("Update successfully.")
                        .status(HttpStatus.OK)
                        .data(updatedBookingDetail)
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
    public ResponseEntity<ResponsePayload> removeBookingDetail(@PathVariable UUID bookingId, @PathVariable UUID id) {
        Optional<BookingDetailResponse> bookingDetailResponse = bookingDetailService.findByBookingIdAndId(bookingId, id);
        if (bookingDetailResponse.isPresent()) {
            bookingDetailService.remove(id);
            return ResponseEntity.ok(ResponsePayload.builder()
                    .message("Remove successfully.")
                    .status(HttpStatus.OK)
                    .build());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponsePayload.builder()
                            .message("Booking detail not found.")
                            .status(HttpStatus.NOT_FOUND)
                            .build());
        }
    }
}

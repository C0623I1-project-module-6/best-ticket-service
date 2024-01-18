package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IBookingService {
    ResponsePayload findAllByIsDeletedFalse(Pageable pageable);
    ResponsePayload findAllByCustomerIdAndIsDeletedFalse(UUID customerId, Pageable pageable);
    ResponsePayload findById(UUID id);
    ResponsePayload save(BookingRequest bookingRequest, UUID id);
    ResponsePayload remove(UUID id);
    ResponsePayload search(UUID eventId, String keywords, Pageable pageable);
    ResponsePayload findAllByEventId(UUID eventId, Pageable pageable);
}

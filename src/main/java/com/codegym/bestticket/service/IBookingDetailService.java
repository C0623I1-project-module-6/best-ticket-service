package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingDetailRequest;
import com.codegym.bestticket.payload.response.booking.BookingDetailResponse;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IBookingDetailService {
    ResponsePayload findAllByBookingIdAndIsDeletedFalse(UUID bookingId, Pageable pageable);
    ResponsePayload findById(UUID id);
    ResponsePayload save(UUID id, BookingDetailRequest bookingDetailRequest);
    ResponsePayload remove(UUID id);
}

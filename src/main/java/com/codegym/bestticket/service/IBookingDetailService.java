package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.booking.BookingDetailRequest;
import com.codegym.bestticket.payload.response.booking.BookingDetailResponse;

import java.util.Optional;
import java.util.UUID;

public interface IBookingDetailService {
    Iterable<BookingDetailResponse> findAll();

    Optional<BookingDetailResponse> findById(UUID id);

    Iterable<BookingDetailResponse> findAllByBookingId(UUID bookingId);

    Optional<BookingDetailResponse> findByBookingIdAndId(UUID bookingId, UUID id);

    void save(BookingDetailRequest bookingDetailRequest);

    void remove(UUID id);

    void delete(UUID id);
}

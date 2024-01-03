package com.codegym.bestticket.repository.booking;

import com.codegym.bestticket.entity.booking.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IBookingDetailRepository extends JpaRepository<BookingDetail, UUID> {
    Iterable<BookingDetail> findAllByBookingId (UUID bookingId);
    Optional<BookingDetail> findByBookingIdAndId(UUID bookingId, UUID id);
}


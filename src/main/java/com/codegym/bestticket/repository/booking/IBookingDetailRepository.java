package com.codegym.bestticket.repository.booking;

import com.codegym.bestticket.entity.booking.BookingDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.Optional;
import java.util.UUID;

public interface IBookingDetailRepository extends JpaRepository<BookingDetail, UUID> {
    Page<BookingDetail> findAllByBookingIdAndIsDeletedFalse (UUID bookingId, Pageable pageable);
    Optional<BookingDetail> findByBookingIdAndId(UUID bookingId, UUID id);
}


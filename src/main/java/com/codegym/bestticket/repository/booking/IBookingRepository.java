package com.codegym.bestticket.repository.booking;

import com.codegym.bestticket.entity.booking.Booking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface IBookingRepository extends JpaRepository<Booking, UUID> {
    Page<Booking> findAllByIsDeletedFalse(Pageable pageable);

    Page<Booking> searchBookingsByIsDeletedFalseAndCustomerFullNameContaining(@Param("keyword") String keyword, Pageable pageable);

    Page<Booking> searchBookingsByIsDeletedFalseAndOrganizerNameContainingIgnoreCase(@Param("keyword") String keyword, Pageable pageable);
}

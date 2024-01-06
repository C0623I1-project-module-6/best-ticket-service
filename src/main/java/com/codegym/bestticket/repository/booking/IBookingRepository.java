package com.codegym.bestticket.repository.booking;

import com.codegym.bestticket.entity.booking.Booking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface IBookingRepository extends JpaRepository<Booking, UUID> {
    Page<Booking> findAllByIsDeletedFalse(Pageable pageable);

    @Query("Select b from Booking b where b.customer.fullName like %:customerFullName%")
    Page<Booking> searchBookingsByIsDeletedFalseAndCustomerContainingIgnoreCase(String customerFullName, Pageable pageable);

    @Query("Select b from Booking b where b.organizer.name like %:organizerName")
    Page<Booking> searchBookingsByIsDeletedFalseAndOrganizerContainingIgnoreCase(String organizerName, Pageable pageable);
}

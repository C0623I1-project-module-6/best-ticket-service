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

    Page<Booking> findAllByCustomerIdAndIsDeletedFalse(UUID customerId, Pageable pageable);

    @Query("SELECT b FROM Booking b JOIN b.customer c JOIN c.user u JOIN b.bookingDetailList bd JOIN bd.tickets t JOIN t.eventTime et JOIN et.event e WHERE e.id = :eventId AND (c.fullName LIKE %:keyword% OR c.phoneNumber LIKE %:keyword% OR u.email LIKE %:keyword%)")
    Page<Booking> searchBookingsByEventIdAndCustomerFullNameContainingOrCustomerPhoneNumberContainingOrCustomerUserEmailContaining(@Param("eventId") UUID eventId, @Param("keyword") String keyword, Pageable pageable);

    @Query("SELECT b FROM Booking b JOIN b.bookingDetailList bd JOIN bd.tickets t JOIN t.eventTime et JOIN et.event e WHERE e.id = :eventId")
    Page<Booking> findAllByEventId(UUID eventId, Pageable pageable);

    @Query("SELECT b from Booking b JOIN b.bookingDetailList bd JOIN bd.tickets t JOIN t.eventTime et join et.time ti where ti.id = :timeId")
    Booking findBookingByTimeId(UUID timeId);
}

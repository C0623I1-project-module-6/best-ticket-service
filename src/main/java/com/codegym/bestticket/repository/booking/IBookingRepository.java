package com.codegym.bestticket.repository.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface IBookingRepository extends JpaRepository<Booking, UUID> {
    Iterable<Booking> searchAllByCustomer(Customer customer);

    Iterable<Booking> searchAllByOrganizer(Organizer organizer);

    Page<Booking> getBookingsByCustomer_Id(Pageable pageable, UUID uuid);
    Page<Booking> findAllByIsDeletedFalse(Pageable pageable);

}

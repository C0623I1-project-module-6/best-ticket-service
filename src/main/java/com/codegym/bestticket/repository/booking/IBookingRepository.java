package com.codegym.bestticket.repository.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface IBookingRepository extends JpaRepository<Booking, UUID> {
    Page<Booking> findAllByIsDeletedFalse(Pageable pageable);
<<<<<<< HEAD
    Page<Booking> getAllByCustomer_FullNameOrOrganizer_NameOrDate(String keywords, Pageable pageable);

=======
    Iterable<Booking> searchAllByCustomer(Customer customer);
    Iterable<Booking> searchAllByOrganizer(Organizer organizer);
>>>>>>> 36ce5437fa7a3401264604b08e28e10cc809dff0
    Page<Booking> getBookingsByCustomer_Id(Pageable pageable, UUID uuid);
}

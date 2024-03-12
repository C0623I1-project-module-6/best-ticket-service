package com.codegym.bestticket.repository.ticket;

import com.codegym.bestticket.entity.ticket.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface ITicketRepository extends JpaRepository<Ticket, UUID> {

    Page<Ticket> findAllByIsDeletedFalse(Pageable pageable);

    Ticket findByIdAndIsDeletedFalse(UUID id);
    @Query("SELECT t FROM Ticket t JOIN t.eventTime et where et.event.id = :eventId")
    Page<Ticket> findTicketByEventId(UUID eventId,Pageable pageable);

    @Query("SELECT t FROM Ticket t JOIN t.eventTime et where et.time.id = :timeId")
    Page<Ticket> findTicketByTimeId(UUID timeId,Pageable pageable);

    @Query("SELECT t FROM Ticket t JOIN t.bookingDetail bd JOIN bd.booking b JOIN b.customer c WHERE c.id = :customerId")
    Page<Ticket> findAllTicketFinishedByCustomerId(UUID customerId, Pageable pageable);
    @Query("SELECT t FROM Ticket t JOIN t.bookingDetail bd JOIN bd.booking b JOIN b.customer c WHERE c.id = :customerId")
    Page<Ticket> findAllTicketByCustomerId(UUID customerId, Pageable pageable);

    @Query("SELECT t FROM Ticket t JOIN t.bookingDetail bd JOIN bd.booking b JOIN b.customer c WHERE c.id = :customerId")
    Page<Ticket> findAllTicketUpcomingByCustomerId(UUID customerId, Pageable pageable);
}

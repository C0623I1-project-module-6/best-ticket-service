package com.codegym.bestticket.repository.ticket;

import com.codegym.bestticket.entity.ticket.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITicketRepository extends JpaRepository<Ticket, UUID> {
    Iterable<Ticket> findAllByStatus(String status, String time);

}

package com.codegym.bestticket.repository.ticket;

import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.ResponsePayload;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ITicketRepository extends JpaRepository<Ticket, UUID> {
    Iterable<Ticket> findAllByStatus(String keyword);
}

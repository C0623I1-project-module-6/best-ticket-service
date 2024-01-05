package com.codegym.bestticket.repository.ticket;

import com.codegym.bestticket.entity.ticket.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITicketRepository extends JpaRepository<Ticket, UUID> {

    Page<Ticket> findAllByIsDeletedFalse(Pageable pageable);
}

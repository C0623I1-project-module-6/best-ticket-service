package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import org.springframework.data.domain.Pageable;

public interface IAdminService {
    ResponsePayload showBookings(Pageable pageable);
    ResponsePayload showTickets(Pageable pageable);
    ResponsePayload showUsers(Pageable pageable);
    ResponsePayload showEvents(Pageable pageable);
}

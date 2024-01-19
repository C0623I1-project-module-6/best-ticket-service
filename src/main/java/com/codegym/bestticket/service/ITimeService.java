package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ITimeService {
    ResponsePayload findTimeByEventId(UUID eventId, Pageable pageable);
}

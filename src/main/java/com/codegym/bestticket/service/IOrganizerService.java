package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

;

public interface IOrganizerService {
    ResponsePayload create(OrganizerDto organizerDto);

    ResponsePayload update(OrganizerDto organizerDto);

    ResponsePayload findByUserId(UUID userId);
}

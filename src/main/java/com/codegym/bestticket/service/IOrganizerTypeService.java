package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.payload.ResponsePayload;

import java.util.UUID;

public interface IOrganizerTypeService {
    ResponsePayload create(OrganizerTypeDto organizerTypeDto);

    ResponsePayload delete(UUID id);

}

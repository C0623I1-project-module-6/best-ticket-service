package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.user.organizer.OrganizerTypeRequest;

import java.util.UUID;

public interface IOrganizerTypeService {
    OrganizerTypeRequest create(OrganizerTypeRequest organizerTypeRequest);

    OrganizerTypeRequest update(UUID id, OrganizerTypeRequest organizerTypeRequest);

    void remove(UUID id);
    void delete(UUID id);
}

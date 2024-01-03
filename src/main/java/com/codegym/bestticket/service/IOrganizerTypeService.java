package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.organizer.OrganizerTypeRequestDTO;

import java.util.UUID;

public interface IOrganizerTypeService {
    OrganizerTypeRequestDTO create(OrganizerTypeRequestDTO organizerTypeRequestDTO);

    OrganizerTypeRequestDTO update(UUID id, OrganizerTypeRequestDTO organizerTypeRequestDTO);

    void remove(UUID id);
    void delete(UUID id);
}

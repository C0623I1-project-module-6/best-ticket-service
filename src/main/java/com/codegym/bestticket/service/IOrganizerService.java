package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.organizer.OrganizerRequestDTO;
import com.codegym.bestticket.payload.response.organizer.OrganizerResponseDTO;

import java.util.List;
import java.util.UUID;

;

public interface IOrganizerService {
    OrganizerResponseDTO create(OrganizerRequestDTO organizerRequestDTO);

    OrganizerResponseDTO update(UUID id, OrganizerRequestDTO organizerRequestDTO);

    void remove(UUID id);
    void delete(UUID id);

    List<OrganizerResponseDTO> findAll();

    OrganizerResponseDTO findById(UUID id);
}

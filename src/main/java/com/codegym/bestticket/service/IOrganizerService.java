package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.OrganizerDTO;
import com.codegym.bestticket.dto.response.user.OrganizerDtoResponse;

import java.util.List;
import java.util.UUID;

;

public interface IOrganizerService {
    OrganizerDtoResponse create(OrganizerDTO organizerDTO);

    OrganizerDtoResponse update(UUID id, OrganizerDTO organizerDTO);

    void remove(UUID id);
    void delete(UUID id);

    List<OrganizerDtoResponse> findAll();

    OrganizerDtoResponse findById(UUID id);
}

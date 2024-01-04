package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.payload.response.user.OrganizerResponse;

import java.util.List;
import java.util.UUID;

;

public interface IOrganizerService {
    OrganizerResponse create(OrganizerDto organizerDto);

    OrganizerResponse update(UUID id, OrganizerDto organizerDto);

    void remove(UUID id);

    void delete(UUID id);

    List<OrganizerResponse> findAll();

    OrganizerResponse findById(UUID id);
}

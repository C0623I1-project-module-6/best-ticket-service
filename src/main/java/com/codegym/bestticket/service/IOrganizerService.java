package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.user.OrganizerRequest;
import com.codegym.bestticket.payload.response.user.OrganizerResponse;

import java.util.List;
import java.util.UUID;

;

public interface IOrganizerService {
    OrganizerResponse create(OrganizerRequest organizerRequest);

    OrganizerResponse update(UUID id, OrganizerRequest organizerRequest);

    void remove(UUID id);
    void delete(UUID id);

    List<OrganizerResponse> findAll();

    OrganizerResponse findById(UUID id);
}

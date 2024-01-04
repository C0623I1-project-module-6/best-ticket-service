package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.OrganizerTypeDto;

import java.util.UUID;

public interface IOrganizerTypeService {
    OrganizerTypeDto create(OrganizerTypeDto organizerTypeDto);

    OrganizerTypeDto update(UUID id, OrganizerTypeDto organizerTypeDto);

    void remove(UUID id);

    void delete(UUID id);
}

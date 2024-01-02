package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.OrganizerTypeDTO;

import java.util.UUID;

public interface IOrganizerTypeService {
    OrganizerTypeDTO create(OrganizerTypeDTO organizerTypeDTO);

    OrganizerTypeDTO update(UUID id, OrganizerTypeDTO organizerTypeDTO);

    void remove(UUID id);
    void delete(UUID id);
}

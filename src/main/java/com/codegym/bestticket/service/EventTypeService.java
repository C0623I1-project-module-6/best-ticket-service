package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.EventTypeDTO;

import java.util.List;
import java.util.UUID;

public interface EventTypeService {
    List<EventTypeDTO> findAll();

    EventTypeDTO findById(UUID id);

    void removeById(UUID id);
}

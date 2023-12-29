package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.EventDTO;
import com.codegym.bestticket.dto.EventTypeDTO;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.event.EventType;

import java.util.List;
import java.util.UUID;

public interface EventTypeService {
    List<EventTypeDTO> findAll();

    EventTypeDTO findById(UUID id);

    void removeById(UUID id);
}

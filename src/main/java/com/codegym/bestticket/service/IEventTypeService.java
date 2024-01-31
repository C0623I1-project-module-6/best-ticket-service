package com.codegym.bestticket.service;


import com.codegym.bestticket.dto.event.EventTypeDTO;
import com.codegym.bestticket.entity.event.EventType;

import java.util.List;
import java.util.UUID;

public interface IEventTypeService {
    List<EventTypeDTO> findAll();

    EventTypeDTO findById(UUID id);

    void removeById(UUID id);

    EventTypeDTO findByName(String name);
}

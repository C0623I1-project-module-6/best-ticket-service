package com.codegym.bestticket.converter;

import com.codegym.bestticket.dto.EventDTO;
import com.codegym.bestticket.entity.event.Event;

import java.util.List;

public interface EventConverter {
    EventDTO entityToDTO(Event element);

    List<EventDTO> entitiesToDTOs(List<Event> element);

    Event dtoToEntity(EventDTO element);
}

package com.codegym.bestticket.converter.event;

import com.codegym.bestticket.dto.EventDTO;
import com.codegym.bestticket.entity.event.Event;

import java.util.List;

public interface IEventConverter {
    EventDTO entityToDTO(Event element);

    List<EventDTO> entitiesToDTOs(List<Event> element);

    Event dtoToEntity(EventDTO element);
}

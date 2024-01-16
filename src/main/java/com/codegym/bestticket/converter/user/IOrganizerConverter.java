package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.entity.user.Organizer;

import java.util.List;

public interface IOrganizerConverter {
    OrganizerDto entityToDto(Organizer organizer);

    Organizer dtoToEntity(OrganizerDto organizerDto);

    List<OrganizerDto> entitiesToDtos(List<Organizer> organizers);
}

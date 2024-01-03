package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.payload.request.organizer.OrganizerRequestDTO;
import com.codegym.bestticket.payload.response.organizer.OrganizerResponseDTO;

import java.util.List;

public interface IOrganizerConverter {
    OrganizerResponseDTO entityToDto(Organizer organizer);

    Organizer dtoToEntity(OrganizerRequestDTO organizerRequestDTO);

    List<OrganizerResponseDTO> entitiesToDTOs(List<Organizer> organizers);
}

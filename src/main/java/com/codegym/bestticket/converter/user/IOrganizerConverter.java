package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.payload.request.user.OrganizerRequest;
import com.codegym.bestticket.payload.response.user.OrganizerResponse;

import java.util.List;

public interface IOrganizerConverter {
    OrganizerResponse entityToDto(Organizer organizer);

    Organizer dtoToEntity(OrganizerRequest organizerRequest);

    List<OrganizerResponse> entitiesToDTOs(List<Organizer> organizers);
}

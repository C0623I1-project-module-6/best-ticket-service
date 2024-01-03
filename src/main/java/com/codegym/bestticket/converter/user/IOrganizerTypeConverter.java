package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.payload.request.organizer.OrganizerTypeRequestDTO;

public interface IOrganizerTypeConverter {
    OrganizerTypeRequestDTO entityToDto(OrganizerType organizerType);

    OrganizerType dtoToEntity(OrganizerTypeRequestDTO organizerTypeRequestDTO);
}

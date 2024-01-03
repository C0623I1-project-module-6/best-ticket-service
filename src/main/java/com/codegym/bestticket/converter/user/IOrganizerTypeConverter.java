package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.payload.request.user.OrganizerTypeRequest;

public interface IOrganizerTypeConverter {
    OrganizerTypeRequest entityToDto(OrganizerType organizerType);

    OrganizerType dtoToEntity(OrganizerTypeRequest organizerTypeRequest);
}

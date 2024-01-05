package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.entity.user.OrganizerType;

public interface IOrganizerTypeConverter {
    OrganizerTypeDto entityToDto(OrganizerType organizerType);

    OrganizerType dtoToEntity(OrganizerTypeDto organizerTypeDto);
}

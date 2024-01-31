package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IOrganizerTypeConverter;
import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.entity.user.OrganizerType;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component

public class OrganizerTypeConverter implements IOrganizerTypeConverter {

    public OrganizerTypeDto entityToDto(OrganizerType organizerType) {
        OrganizerTypeDto organizerTypeDto = new OrganizerTypeDto();
        BeanUtils.copyProperties(organizerType, organizerTypeDto);
        return organizerTypeDto;
    }

    public OrganizerType dtoToEntity(OrganizerTypeDto organizerTypeDto) {
        OrganizerType organizerType = new OrganizerType();
        BeanUtils.copyProperties(organizerTypeDto, organizerType);
        return organizerType;
    }
}

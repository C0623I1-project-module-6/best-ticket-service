package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IOrganizerTypeConverter;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.payload.request.user.OrganizerTypeRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component

public class OrganizerTypeConverter implements IOrganizerTypeConverter {

    public OrganizerTypeRequest entityToDto(OrganizerType organizerType) {
        OrganizerTypeRequest organizerTypeRequest = new OrganizerTypeRequest();
        BeanUtils.copyProperties(organizerType, organizerTypeRequest);
        return organizerTypeRequest;
    }

    public OrganizerType dtoToEntity(OrganizerTypeRequest organizerTypeRequest) {
        OrganizerType organizerType = new OrganizerType();
        BeanUtils.copyProperties(organizerTypeRequest, organizerType);
        return organizerType;
    }
}

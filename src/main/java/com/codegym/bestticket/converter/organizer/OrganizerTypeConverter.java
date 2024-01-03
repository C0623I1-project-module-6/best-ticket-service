package com.codegym.bestticket.converter.organizer;

import com.codegym.bestticket.payload.request.user.organizer.OrganizerTypeRequest;
import com.codegym.bestticket.entity.user.organizer.OrganizerType;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrganizerTypeConverter {
    public OrganizerTypeRequest entityToDto(OrganizerType organizerType) {
        OrganizerTypeRequest organizerTypeRequest = new OrganizerTypeRequest();
        BeanUtils.copyProperties(organizerType, organizerTypeRequest);
        return organizerTypeRequest;
    }

    public OrganizerType dtoToEntity(OrganizerTypeRequest organizerTypeRequest) {
        OrganizerType organizerType= new OrganizerType();
        BeanUtils.copyProperties(organizerTypeRequest, organizerType);
        return organizerType;
    }
}

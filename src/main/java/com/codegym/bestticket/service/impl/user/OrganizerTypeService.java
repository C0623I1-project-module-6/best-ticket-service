package com.codegym.bestticket.service.impl.user;


import com.codegym.bestticket.converter.user.IOrganizerTypeConverter;
import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.user.IOrganizerTypeRepository;
import com.codegym.bestticket.service.IOrganizerTypeService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class OrganizerTypeService implements IOrganizerTypeService {
    private final IOrganizerTypeConverter organizerTypeConverter;
    private final IOrganizerTypeRepository organizerTypeRepository;

    @Override
    public ResponsePayload create(OrganizerTypeDto organizerTypeDto) {
        try {
            OrganizerType organizerType =
                    organizerTypeConverter.dtoToEntity(organizerTypeDto);
            organizerType.setIsDeleted(false);
            organizerTypeRepository.save(organizerType);
            return ResponsePayload.builder()
                    .message("Add organizer type successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(organizerTypeConverter.entityToDto(organizerType))
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Add organizer type failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }

    }

    @Override
    public ResponsePayload delete(UUID id) {
        try {
            OrganizerType organizerType = organizerTypeRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Organizer type not found"));
            organizerType.setIsDeleted(true);
            organizerTypeRepository.save(organizerType);
            return ResponsePayload.builder()
                    .message("Organizer type deleted!!!")
                    .status(HttpStatus.OK)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Organizer type by" + id + "not found!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }

    }


}

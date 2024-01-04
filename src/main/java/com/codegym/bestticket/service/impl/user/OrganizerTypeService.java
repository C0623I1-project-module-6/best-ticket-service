package com.codegym.bestticket.service.impl.user;


import com.codegym.bestticket.converter.user.IOrganizerTypeConverter;
import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.repository.user.IOrganizerTypeRepository;
import com.codegym.bestticket.service.IOrganizerTypeService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class OrganizerTypeService implements IOrganizerTypeService {
    private final IOrganizerTypeConverter organizerTypeConverter;
    private final IOrganizerTypeRepository organizerTypeRepository;

    @Override
    public OrganizerTypeDto create(OrganizerTypeDto organizerTypeDto) {
        OrganizerType organizerType =
                organizerTypeConverter.dtoToEntity(organizerTypeDto);
        organizerType.setIsDeleted(false);
        organizerTypeRepository.save(organizerType);
        return organizerTypeConverter.entityToDto(organizerType);
    }

    @Override
    public OrganizerTypeDto update(UUID id, OrganizerTypeDto organizerTypeDto) {
        return null;
    }

    @Override
    public void remove(UUID id) {
        OrganizerType organizerType = organizerTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Organizer type not found"));
        organizerType.setIsDeleted(true);
        organizerTypeRepository.save(organizerType);
    }

    @Override
    public void delete(UUID id) {
        organizerTypeRepository.deleteById(id);
    }
}

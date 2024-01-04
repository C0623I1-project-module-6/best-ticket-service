package com.codegym.bestticket.service.impl.user.organizer;

import com.codegym.bestticket.converter.organizer.OrganizerTypeConverter;
import com.codegym.bestticket.entity.user.organizer.OrganizerType;
import com.codegym.bestticket.payload.request.user.organizer.OrganizerTypeRequest;
import com.codegym.bestticket.repository.user.organizer.IOrganizerTypeRepository;
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
    private final OrganizerTypeConverter organizerTypeConverter;
    private final IOrganizerTypeRepository organizerTypeRepository;

    @Override
    public OrganizerTypeRequest create(OrganizerTypeRequest organizerTypeRequest) {
        OrganizerType organizerType =
                organizerTypeConverter.dtoToEntity(organizerTypeRequest);
        organizerType.setIsDeleted(false);
        organizerTypeRepository.save(organizerType);
        return organizerTypeConverter.entityToDto(organizerType);
    }

    @Override
    public OrganizerTypeRequest update(UUID id, OrganizerTypeRequest organizerTypeRequest) {
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

package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IOrganizerConverter;
import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.OrganizerResponse;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IOrganizerTypeRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class OrganizerService implements IOrganizerService {
    private final IOrganizerConverter organizerConverter;
    private final IOrganizerRepository organizerRepository;
    private final IUserRepository userRepository;
    private final IOrganizerTypeRepository organizerTypeRepository;

    @Override
    public OrganizerResponse create(OrganizerDto organizerDto) {
        try {
            UUID userId = organizerDto.getUser();
            User user = userRepository.findById(userId)
                    .orElseThrow(() -> new EntityNotFoundException("User not found"));
            UUID organizerTypeId = organizerDto.getOrganizerType();
            OrganizerType organizerType = organizerTypeRepository.findById(organizerTypeId)
                    .orElseThrow(() -> new EntityNotFoundException("Organizer type not found"));
            Organizer organizer = organizerConverter.dtoToEntity(organizerDto);
            organizer.setUser(user);
            organizer.setOrganizerType(organizerType);
            organizer.setIsDeleted(false);
            organizerRepository.save(organizer);
            return organizerConverter.entityToDto(organizer);
        } catch (RuntimeException e) {

        }
        return null;
    }


    @Override
    public OrganizerResponse update(UUID id, OrganizerDto organizerDto) {
        Optional<Organizer> optionalOrganizer = organizerRepository.findById(id);
        if (optionalOrganizer.isEmpty()) {
            throw new EntityNotFoundException("Organizer not found" + id);
        }
        Organizer organizer = optionalOrganizer.get();
        String oldPhoneNumber = organizer.getPhoneNumber();
        String oldEmail = organizer.getEmail();
        String oldIdCard = organizer.getIdCard();
        String oldTaxCode = organizer.getTaxCode();
        organizerConverter.dtoToEntity(organizerDto);
        organizer.setPhoneNumber(oldPhoneNumber);
        organizer.setEmail(oldEmail);
        organizer.setIdCard(oldIdCard);
        organizer.setTaxCode(oldTaxCode);
        organizerRepository.save(organizer);
        return organizerConverter.entityToDto(organizer);
    }

    @Override
    public void remove(UUID id) {
        Organizer organizer = organizerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Organizer not found"));
        organizer.setIsDeleted(true);
        organizerRepository.save(organizer);
    }

    @Override
    public void delete(UUID id) {
        organizerRepository.deleteById(id);
    }

    @Override
    public List<OrganizerResponse> findAll() {
        return organizerConverter.entitiesToDtos(
                organizerRepository.findAllByIsDeletedFalse());
    }

    @Override
    public OrganizerResponse findById(UUID id) {
        Organizer organizer =
                organizerRepository.findByIdAndIsDeletedFalse(id);
        if (organizer != null) {
            return organizerConverter.entityToDto(organizer);
        } else {
            throw new EntityNotFoundException("Organizer not found");
        }
    }
}

package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IOrganizerConverter;
import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.user.OrganizerResponse;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IOrganizerTypeRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
    public ResponsePayload create(OrganizerDto organizerDto) {
        try {
            UUID userId = organizerDto.getUser();
            User user = userRepository.findById(userId)
                    .orElseThrow(() -> new EntityNotFoundException("User not found!"));
            UUID organizerTypeId = organizerDto.getOrganizerType();
            OrganizerType organizerType = organizerTypeRepository.findById(organizerTypeId)
                    .orElseThrow(() -> new EntityNotFoundException("Organizer type not found!"));
            Organizer organizer = organizerConverter.dtoToEntity(organizerDto);
            organizer.setUser(user);
            organizer.setOrganizerType(organizerType);
            organizer.setIsDeleted(false);
            organizerRepository.save(organizer);
            OrganizerResponse organizerResponse = organizerConverter.entityToDto(organizer);
            return ResponsePayload.builder()
                    .message("Add organizer successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(organizerResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Add organizer failed!")
                    .status(HttpStatus.CREATED)
                    .build();
        }
    }


    @Override
    public ResponsePayload update(UUID id, OrganizerDto organizerDto) {
        try {
            Optional<Organizer> optionalOrganizer = organizerRepository.findById(id);
            if (optionalOrganizer.isEmpty()) {
                throw new EntityNotFoundException("Organizer not found!" + id);
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
            OrganizerResponse organizerResponse = organizerConverter.entityToDto(organizer);
            return ResponsePayload.builder()
                    .message("Edit organizer successfully!!!")
                    .status(HttpStatus.OK)
                    .data(organizerResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Edit organizer failed!")
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }
    }

    @Override
    public ResponsePayload findAll(Pageable pageable) {
        try {
            Page<OrganizerResponse> organizers = organizerRepository.findAllByIsDeletedFalse(pageable)
                    .map(organizerConverter::entityToDto);
            return ResponsePayload.builder()
                    .message("Organizer list!!!")
                    .status(HttpStatus.OK)
                    .data(organizers)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Organizer list not found!")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }

    }

    @Override
    public ResponsePayload findById(UUID id) {
        try {
            Organizer organizer = organizerRepository.findByIdAndIsDeletedFalse(id)
                    .orElseThrow(() -> new EntityNotFoundException("Id not found!"));
            OrganizerResponse organizerResponse = organizerConverter.entityToDto(organizer);
            return ResponsePayload.builder()
                    .message("Organizer by" + id)
                    .status(HttpStatus.OK)
                    .data(organizerResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Organizer by" + id + "not found or is deleted!")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }

    }
}

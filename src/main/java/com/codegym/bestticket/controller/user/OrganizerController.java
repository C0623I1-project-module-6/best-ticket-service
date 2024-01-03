package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.request.organizer.OrganizerRequestDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.response.organizer.OrganizerResponseDTO;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api/organizers")
public class OrganizerController {
    private final IOrganizerService organizerService;

    @GetMapping("")
    public ResponseEntity<ResponseDto> getOrganizers() {
        try {
            List<OrganizerResponseDTO> organizerResponsDTOS =
                    organizerService.findAll();
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer list")
                            .status(HttpStatus.OK)
                            .data(organizerResponsDTOS)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer list not found!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getOrganizer(@PathVariable UUID id) {
        try {
            OrganizerResponseDTO organizerResponseDTO =
                    organizerService.findById(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer" + organizerResponseDTO.getId())
                            .status(HttpStatus.OK)
                            .data(organizerResponseDTO)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer" + id + "not found!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addOrganizer(@RequestBody OrganizerRequestDTO organizerRequestDTO) {
        try {
            if (organizerRequestDTO == null) {
                return new ResponseEntity<>(
                        ResponseDto.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            OrganizerResponseDTO organizerResponseDTO = organizerService.create(organizerRequestDTO);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add organizer successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(organizerResponseDTO)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add organizer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto> editOrganizer(@PathVariable UUID id,
                                                     @RequestBody OrganizerRequestDTO organizerRequestDTO) {
        try {
            if (organizerRequestDTO == null) {
                return new ResponseEntity<>(
                        ResponseDto.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            OrganizerResponseDTO organizerResponseDTO = organizerService.update(id, organizerRequestDTO);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Edit organizer successfully!!!")
                            .status(HttpStatus.OK)
                            .data(organizerResponseDTO)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Edit organizer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponseDto> disableOrganizer(@PathVariable UUID id) {
        try {
            organizerService.remove(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteOrganizer(@PathVariable UUID id) {
        try {
            organizerService.delete(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer deleted!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}
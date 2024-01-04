package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IOrganizerTypeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api/organizer-types")
public class OrganizerTypeController {
    private final IOrganizerTypeService organizerTypeService;

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addOrganizerType(@RequestBody OrganizerTypeDto organizerTypeDto) {
        try {
            if (organizerTypeDto == null) {
                return new ResponseEntity<>(
                        ResponsePayload.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            OrganizerTypeDto resultOrganizerTypeDto = organizerTypeService.create(organizerTypeDto);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Add organizer type successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(resultOrganizerTypeDto)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Add organizer type failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponsePayload> disableOrganizerType(@PathVariable UUID id) {
        try {
            organizerTypeService.remove(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer type disable!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer type not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponsePayload> deleteOrganizerType(@PathVariable UUID id) {
        try {
            organizerTypeService.delete(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer type deleted!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer type not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.user.OrganizerResponse;
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
    public ResponseEntity<ResponsePayload> getOrganizers() {
        try {
            List<OrganizerResponse> organizerResponsesDTOS =
                    organizerService.findAll();
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer list")
                            .status(HttpStatus.OK)
                            .data(organizerResponsesDTOS)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer list not found!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getOrganizer(@PathVariable UUID id) {
        try {
            OrganizerResponse organizerResponse =
                    organizerService.findById(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer" + organizerResponse.getId())
                            .status(HttpStatus.OK)
                            .data(organizerResponse)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer" + id + "not found!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addOrganizer(@RequestBody OrganizerDto organizerDto) {
        try {
            if (organizerDto == null) {
                return new ResponseEntity<>(
                        ResponsePayload.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            OrganizerResponse organizerResponse = organizerService.create(organizerDto);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Add organizer successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(organizerResponse)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Add organizer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> editOrganizer(@PathVariable UUID id,
                                                         @RequestBody OrganizerDto organizerDto) {
        try {
            if (organizerDto == null) {
                return new ResponseEntity<>(
                        ResponsePayload.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            OrganizerResponse organizerResponse = organizerService.update(id, organizerDto);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Edit organizer successfully!!!")
                            .status(HttpStatus.OK)
                            .data(organizerResponse)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Edit organizer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponsePayload> disableOrganizer(@PathVariable UUID id) {
        try {
            organizerService.remove(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponsePayload> deleteOrganizer(@PathVariable UUID id) {
        try {
            organizerService.delete(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer deleted!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Organizer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

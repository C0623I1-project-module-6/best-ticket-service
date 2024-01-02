package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.OrganizerDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.response.user.OrganizerDtoResponse;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            List<OrganizerDtoResponse> organizerDtoResponses =
                    organizerService.findAll();
            return new ResponseEntity<>(
                    new ResponseDto("Organizer list",
                            HttpStatus.OK,
                            organizerDtoResponses), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Organizer list not found",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getOrganizer(@PathVariable UUID id) {
        try {
            OrganizerDtoResponse organizerDtoResponse =
                    organizerService.findById(id);
            return new ResponseEntity<>(
                    new ResponseDto("Organizer" + id,
                            HttpStatus.OK,
                            organizerDtoResponse), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Organizer not found or is deleted",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addOrganizer(@RequestBody OrganizerDTO organizerDTO) {
        try {
            if (organizerDTO == null) {
                return new ResponseEntity<>(
                        new ResponseDto("Request not found!!!",
                                HttpStatus.BAD_REQUEST,
                                null), HttpStatus.BAD_REQUEST);
            }
            OrganizerDtoResponse organizerDtoResponse = organizerService.create(organizerDTO);
            return new ResponseEntity<>(
                    new ResponseDto("Add organizer successfully!!!",
                            HttpStatus.CREATED,
                            organizerDtoResponse), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Add organizer failed",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto> editOrganizer(@PathVariable UUID id,
                                                     @RequestBody OrganizerDTO organizerDTO) {
        try {
            if (organizerDTO == null) {
                return new ResponseEntity<>(
                        new ResponseDto("Request not found!!!",
                                HttpStatus.BAD_REQUEST,
                                null), HttpStatus.BAD_REQUEST);
            }
            OrganizerDtoResponse organizerDtoResponse = organizerService.update(id, organizerDTO);
            return new ResponseEntity<>(
                    new ResponseDto("Edit organizer successfully!!!",
                            HttpStatus.OK,
                            organizerDtoResponse), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Edit organizer failed",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponseDto> disableOrganizer(@PathVariable UUID id) {
        try {
            organizerService.remove(id);
            return new ResponseEntity<>(
                    new ResponseDto("Organizer disabled!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Organizer not found or is deleted",
                            HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteOrganizer(@PathVariable UUID id) {
        try {
            organizerService.delete(id);
            return new ResponseEntity<>(
                    new ResponseDto("Organizer deleted!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Organizer not found or is deleted",
                            HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
        }
    }
}

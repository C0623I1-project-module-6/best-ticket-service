package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.OrganizerTypeDTO;
import com.codegym.bestticket.dto.ResponseDto;
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
@RequestMapping("/api/organizer_types")
public class OrganizerTypeController {
    private final IOrganizerTypeService organizerTypeService;

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addOrganizer(@RequestBody OrganizerTypeDTO organizerTypeDTO) {
        try {
            if (organizerTypeDTO == null) {
                return new ResponseEntity<>(
                        ResponseDto.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            OrganizerTypeDTO resultOrganizerTypeDTO = organizerTypeService.create(organizerTypeDTO);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add organizer type successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(resultOrganizerTypeDTO)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add organizer type failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> deleteCustomer(@PathVariable UUID id) {
        try {
            organizerTypeService.remove(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer type deleted!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Organizer type not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.OrganizerTypeDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.service.IOrganizerTypeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
                        new ResponseDto("Request not found!!!",
                                HttpStatus.BAD_REQUEST,
                                null), HttpStatus.BAD_REQUEST);
            }
            OrganizerTypeDTO resultOrganizerTypeDTO = organizerTypeService.create(organizerTypeDTO);
            return new ResponseEntity<>(
                    new ResponseDto("Add organizer type successfully!!!",
                            HttpStatus.CREATED,
                            resultOrganizerTypeDTO), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Add organizer type failed",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> deleteCustomer(@PathVariable UUID id) {
        try {
            organizerTypeService.remove(id);
            return new ResponseEntity<>(
                    new ResponseDto("Organizer type deleted!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Organizer type not found or is deleted",
                            HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
        }
    }
}

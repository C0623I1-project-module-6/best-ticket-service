package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.user.OrganizerTypeDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IOrganizerTypeService;
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

    @PostMapping("/")
    public ResponseEntity<ResponsePayload> add(@RequestBody OrganizerTypeDto organizerTypeDto) {
        if (organizerTypeDto == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerTypeService.create(organizerTypeDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.OK);
        }
        return new ResponseEntity<>(organizerTypeService.delete(id), HttpStatus.NOT_FOUND);
    }

}

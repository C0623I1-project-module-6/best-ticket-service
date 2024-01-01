package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.OrganizerDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.dto.response.user.OrganizerDtoResponse;
import com.codegym.bestticket.service.ICustomerService;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api/organizers")
public class OrganizerController {
    private final IOrganizerService organizerService;

//    @GetMapping("")
//    public ResponseEntity<ResponseDto> getCustomers() {
//        try {
//            List<CustomerDtoResponse> customerDtoResponse =
//                    customerService.findAll();
//            return new ResponseEntity<>(
//                    new ResponseDto("Customer list",
//                            HttpStatus.OK,
//                            customerDtoResponse), HttpStatus.OK);
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(
//                    new ResponseDto("Customer list not found",
//                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ResponseDto> getCustomer(@PathVariable UUID id){
//        try{
//            CustomerDtoResponse customerDtoResponse=
//                    customerService.findById(id);
//            return new ResponseEntity<>(
//                    new ResponseDto("Customer" + id,
//                            HttpStatus.OK,
//                            customerDtoResponse),HttpStatus.OK);
//        } catch (RuntimeException e){
//            return new ResponseEntity<>(
//                    new ResponseDto("Customer not found or is delete",
//                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
//        }
//    }

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

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> deleteCustomer(@PathVariable UUID id) {
        try {
            organizerService.remove(id);
            return new ResponseEntity<>(
                    new ResponseDto("Customer deleted!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("User not found",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }
}

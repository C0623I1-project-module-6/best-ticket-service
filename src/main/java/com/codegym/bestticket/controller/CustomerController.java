package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@CrossOrigin("*")
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private final ICustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addCustomer(@RequestBody CustomerDTO customerDTO) {
        try {
            if (customerDTO == null) {
                return new ResponseEntity<>(
                        new ResponseDto("Request not found!!!",
                                HttpStatus.BAD_REQUEST,
                                null), HttpStatus.BAD_REQUEST);
            }
            CustomerDtoResponse customerDtoResponse = customerService.create(customerDTO);
            return new ResponseEntity<>(
                    new ResponseDto("Add customer successfully!!!",
                            HttpStatus.CREATED,
                            customerDtoResponse), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Add customer failed",
                    HttpStatus.BAD_REQUEST),HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<ResponseDto> editCustomer(@PathVariable UUID id,
                                                    @RequestBody CustomerDTO customerDTO){
        try{
            if (customerDTO == null) {
                return new ResponseEntity<>(
                        new ResponseDto("Request not found!!!",
                                HttpStatus.BAD_REQUEST,
                                null), HttpStatus.BAD_REQUEST);
            }
            CustomerDtoResponse customerDtoResponse=customerService.update(id,customerDTO);
            return new ResponseEntity<>(
                    new ResponseDto("Edit customer successfully!!!",
                            HttpStatus.OK,
                            customerDtoResponse),HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity<>(
                    new ResponseDto("Edit customer failed",
                            HttpStatus.BAD_REQUEST),HttpStatus.BAD_REQUEST);
        }
    }
}

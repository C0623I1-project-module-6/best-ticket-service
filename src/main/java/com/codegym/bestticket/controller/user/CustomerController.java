package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.service.ICustomerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private final ICustomerService customerService;

    @GetMapping("")
    public ResponseEntity<ResponseDto> getCustomers() {
        try {
            List<CustomerDtoResponse> customerDtoResponse =
                    customerService.findAll();
            return new ResponseEntity<>(
                    new ResponseDto("Customer list",
                            HttpStatus.OK,
                            customerDtoResponse), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Customer list not found",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getCustomer(@PathVariable UUID id){
        try{
            CustomerDtoResponse customerDtoResponse=
                    customerService.findById(id);
            return new ResponseEntity<>(
                    new ResponseDto("Customer" + id,
                            HttpStatus.OK,
                            customerDtoResponse),HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity<>(
                    new ResponseDto("Customer not found or is delete",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

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
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto> editCustomer(@PathVariable UUID id,
                                                    @RequestBody CustomerDTO customerDTO) {
        try {
            if (customerDTO == null) {
                return new ResponseEntity<>(
                        new ResponseDto("Request not found!!!",
                                HttpStatus.BAD_REQUEST,
                                null), HttpStatus.BAD_REQUEST);
            }
            CustomerDtoResponse customerDtoResponse = customerService.update(id, customerDTO);
            return new ResponseEntity<>(
                    new ResponseDto("Edit customer successfully!!!",
                            HttpStatus.OK,
                            customerDtoResponse), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Edit customer failed",
                            HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ResponseDto> removeCustomer(@PathVariable UUID id) {
        try {
            customerService.remove(id);
            return new ResponseEntity<>(
                    new ResponseDto("Customer disabled!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Customer not found or is deleted",
                            HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteCustomer(@PathVariable UUID id) {
        try {
            customerService.delete(id);
            return new ResponseEntity<>(
                    new ResponseDto("Customer deleted!!!",
                            HttpStatus.OK), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    new ResponseDto("Customer not found or is deleted",
                            HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
        }
    }
}

package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.request.customer.CustomerRequestDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.response.customer.CustomerResponseDTO;
import com.codegym.bestticket.service.ICustomerService;
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
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private final ICustomerService customerService;

    @GetMapping("")
    public ResponseEntity<ResponseDto> getCustomers() {
        try {
            List<CustomerResponseDTO> customerResponsDTOS =
                    customerService.findAll();
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer list")
                            .status(HttpStatus.OK)
                            .data(customerResponsDTOS)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer list not found!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getCustomer(@PathVariable UUID id) {
        try {
            CustomerResponseDTO customerResponseDTO =
                    customerService.findById(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer" + customerResponseDTO.getId())
                            .status(HttpStatus.OK)
                            .data(customerResponseDTO)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer" + id + "not found")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        try {
            if (customerRequestDTO == null) {
                return new ResponseEntity<>(
                        ResponseDto.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            CustomerResponseDTO customerResponseDTO = customerService.create(customerRequestDTO);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add customer successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(customerResponseDTO)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Add customer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto> editCustomer(@PathVariable UUID id,
                                                    @RequestBody CustomerRequestDTO customerRequestDTO) {
        try {
            if (customerRequestDTO == null) {
                return new ResponseEntity<>(
                        ResponseDto.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            CustomerResponseDTO customerResponseDTO = customerService.update(id, customerRequestDTO);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Edit customer successfully!!!")
                            .status(HttpStatus.OK)
                            .data(customerResponseDTO)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Edit customer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponseDto> disableCustomer(@PathVariable UUID id) {
        try {
            customerService.remove(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteCustomer(@PathVariable UUID id) {
        try {
            customerService.delete(id);
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer deleted!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponseDto.builder()
                            .message("Customer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

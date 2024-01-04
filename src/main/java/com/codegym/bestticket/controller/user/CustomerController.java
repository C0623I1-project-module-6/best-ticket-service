package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.payload.request.CustomerRequest;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.user.customer.CustomerResponse;
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
    public ResponseEntity<ResponsePayload> getCustomers() {
        try {
            List<CustomerResponse> customerResponsDTOS =
                    customerService.findAll();
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer list")
                            .status(HttpStatus.OK)
                            .data(customerResponsDTOS)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer list not found!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getCustomer(@PathVariable UUID id) {
        try {
            CustomerResponse customerResponse =
                    customerService.findById(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer" + customerResponse.getId())
                            .status(HttpStatus.OK)
                            .data(customerResponse)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer" + id + "not found")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addCustomer(@RequestBody CustomerRequest customerRequest) {
        try {
            if (customerRequest == null) {
                return new ResponseEntity<>(
                        ResponsePayload.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            CustomerResponse customerResponse = customerService.create(customerRequest);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Add customer successfully!!!")
                            .status(HttpStatus.CREATED)
                            .data(customerResponse)
                            .build(),
                    HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Add customer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> editCustomer(@PathVariable UUID id,
                                                        @RequestBody CustomerRequest customerRequest) {
        try {
            if (customerRequest == null) {
                return new ResponseEntity<>(
                        ResponsePayload.builder()
                                .message("Request not found!")
                                .status(HttpStatus.BAD_REQUEST)
                                .build(),
                        HttpStatus.BAD_REQUEST);
            }
            CustomerResponse customerResponse = customerService.update(id, customerRequest);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Edit customer successfully!!!")
                            .status(HttpStatus.OK)
                            .data(customerResponse)
                            .build(),
                    HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Edit customer failed!")
                            .status(HttpStatus.BAD_REQUEST)
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/disable/{id}")
    public ResponseEntity<ResponsePayload> disableCustomer(@PathVariable UUID id) {
        try {
            customerService.remove(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer disabled!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponsePayload> deleteCustomer(@PathVariable UUID id) {
        try {
            customerService.delete(id);
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer deleted!!!")
                            .status(HttpStatus.OK)
                            .build(),
                    HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(
                    ResponsePayload.builder()
                            .message("Customer not found or is deleted!")
                            .status(HttpStatus.NOT_FOUND)
                            .build(),
                    HttpStatus.NOT_FOUND);
        }
    }
}

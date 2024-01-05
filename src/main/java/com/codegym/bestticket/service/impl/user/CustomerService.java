package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.ICustomerConverter;
import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.user.CustomerResponse;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.ICustomerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class CustomerService implements ICustomerService {
    private final ICustomerConverter customerConverter;
    private final ICustomerRepository customerRepository;
    private final IUserRepository userRepository;

    @Override
    public ResponsePayload create(CustomerDto customerDto) {
        try {
            UUID userid = customerDto.getUser();
            User user = userRepository.findById(userid)
                    .orElseThrow(() -> new EntityNotFoundException("User not found"));
            Customer customer = customerConverter.dtoToEntity(customerDto);
            customer.setUser(user);
            customer.setIsDeleted(false);
            customerRepository.save(customer);
            CustomerResponse customerResponse = customerConverter.entityToDto(customer);
            return ResponsePayload.builder()
                    .message("Add customer successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(customerResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Add customer failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload update(UUID id, CustomerDto customerDto) {
        try {
            Optional<Customer> optionalCustomer = customerRepository.findById(id);
            if (optionalCustomer.isEmpty()) {
                throw new EntityNotFoundException("Customer not found is" + id);
            }
            Customer customer = optionalCustomer.get();
            String oldIdCard = customer.getIdCard();
            String oldPhoneNumber = customer.getPhoneNumber();
            customerConverter.dtoToEntity(customerDto);
            customer.setIdCard(oldIdCard);
            customer.setPhoneNumber(oldPhoneNumber);
            customerRepository.save(customer);
            CustomerResponse customerResponse = customerConverter.entityToDto(customer);
            return ResponsePayload.builder()
                    .message("Edit customer successfully!!!")
                    .status(HttpStatus.OK)
                    .data(customerResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Edit customer failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload findAll() {
        try {
            List<CustomerResponse> customerResponses = customerConverter.entitiesToDtos(
                    customerRepository.findAllByIsDeletedFalse());
            return ResponsePayload.builder()
                    .message("Customer list!!!")
                    .status(HttpStatus.OK)
                    .data(customerResponses)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Customer list not found!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }

    }

    @Override
    public ResponsePayload findById(UUID id) {
        try {
            Customer customer = customerRepository.findByIdAndIsDeletedFalse(id)
                    .orElseThrow(() -> new EntityNotFoundException("Id not found!"));
            CustomerResponse customerResponse = customerConverter.entityToDto(customer);
            return ResponsePayload.builder()
                    .message("Customer by " + id)
                    .status(HttpStatus.OK)
                    .data(customerResponse)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Customer by " + id + "not found or is deleted")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
}

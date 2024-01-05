package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.ICustomerConverter;
import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.CustomerNotFoundException;
import com.codegym.bestticket.exception.UserNotFoundException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.CustomerRequest;
import com.codegym.bestticket.payload.response.user.CustomerResponse;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.ICustomerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
    public ResponsePayload addInfo(UUID id, CustomerRequest customerRequest) {
        try {
            Customer customer = customerRepository.findById(id)
                    .orElseThrow(() -> new CustomerNotFoundException("Customer not found by" + id));
            User user = userRepository.findById(customer.getUser().getId())
                    .orElseThrow(() -> new UserNotFoundException("User not found by" + id));
            User.builder()
                    .avatar(customerRequest.getAvatar())
                    .build();
            userRepository.save(user);
            Customer.builder()
                    .fullName(customerRequest.getFullName())
                    .gender(customerRequest.getGender())
                    .idCard(customerRequest.getIdCard())
                    .dateOfBirth(customerRequest.getDateOfBirth())
                    .build();
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
    public ResponsePayload findAll(Pageable pageable) {
        try {
            Page<CustomerResponse> customerResponses = customerRepository.findAllByIsDeletedFalse(pageable)
                    .map(customerConverter::entityToDto);
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

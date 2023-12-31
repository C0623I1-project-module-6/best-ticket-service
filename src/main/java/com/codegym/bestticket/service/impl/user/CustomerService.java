package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.CustomerConverter;
import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.entity.user.Customer;

import com.codegym.bestticket.repository.ICustomerRepository;
import com.codegym.bestticket.repository.IUserRepository;
import com.codegym.bestticket.service.ICustomerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
@Builder
public class CustomerService implements ICustomerService {
    private final CustomerConverter customerConverter;
    private final ICustomerRepository customerRepository;
    private final IUserRepository userRepository;

    @Override
    public CustomerDtoResponse create(CustomerDTO customerDTO) {
//        UUID userId = customerDTO.getUserId();
//        User user = userRepository.findById(userId)
//                .orElseThrow(()-> new IllegalArgumentException("User not found"));
//        try {
//            UUID.fromString(userId.toString());
//        } catch (IllegalArgumentException e) {
//            throw new IllegalArgumentException("Invalid UUID format");
//        }
        Customer customer = customerConverter.dtoToEntity(customerDTO);
        customerRepository.save(customer);
        CustomerDtoResponse customerDtoResponse =
                customerConverter.entityToDto(customer);
        return customerDtoResponse;
    }

    @Override
    public CustomerDtoResponse update(UUID id, CustomerDTO customerDTO) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer newCustomer = customerConverter.dtoToEntity(customerDTO);
            customerRepository.save(newCustomer);
            CustomerDtoResponse updatedCustomerDtoResponse = customerConverter.entityToDto(newCustomer);
            return updatedCustomerDtoResponse;
        } else {
            throw new EntityNotFoundException("Customer not found");
        }
    }


    @Override
    public void remove(UUID id) {

    }

}

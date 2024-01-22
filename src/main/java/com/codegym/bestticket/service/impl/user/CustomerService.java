package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.ICustomerConverter;
import com.codegym.bestticket.converter.user.IUserConverter;
import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.user.CustomerNotFoundException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.ICustomerService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
@AllArgsConstructor
@Transactional
public class CustomerService implements ICustomerService {
    private final ICustomerConverter customerConverter;
    private final IUserConverter userConverter;
    private final ICustomerRepository customerRepository;
    private final IUserRepository userRepository;
    private final IRoleRepository roleRepository;


    @Override
    public ResponsePayload create(CustomerDto customerDto) {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String username = userDetails.getUsername();
            User user = userRepository.findByUsername(username)
                    .orElseThrow(() -> new RuntimeException("User not found"));
            Customer customer = customerConverter.dtoToEntity(customerDto);
            customer.setIsDeleted(false);
            customer.setUser(user);
            customerRepository.save(customer);
            CustomerDto response = customerConverter.entityToDto(customer);
            user.getRoles().add(roleRepository.findByName("CUSTOMER")
                    .orElseThrow(() -> new RuntimeException("Role CUSTOMER not found!")));
            Map<String, Object> result = userConverter.mapUserToResult(user);
            response.setResult(result);
            return ResponsePayload.builder()
                    .message("Add customer successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(response)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Add customer failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload update(CustomerDto customerDto) {
        try {
            UserDetails userDetails = (UserDetails) SecurityContextHolder
                    .getContext()
                    .getAuthentication()
                    .getPrincipal();
            String username = userDetails.getUsername();
            User user = userRepository.findByUsername(username)
                    .orElseThrow(() -> new RuntimeException("User not found!"));
            String oldEmail = user.getEmail();
            user.setEmail(ObjectUtils.defaultIfNull(customerDto.getEmail(), oldEmail));
            userRepository.save(user);
            Customer customer = customerRepository.findByUserId(user.getId())
                    .orElseThrow(() -> new CustomerNotFoundException("Customer not found!"));
            customerConverter.dtoToEntity(customerDto);
            String oldFullName=customer.getFullName();
            customer.setFullName(ObjectUtils.defaultIfNull(customerDto.getFullName(),oldFullName));
            String oldPhoneNumber = customer.getPhoneNumber();
            customer.setPhoneNumber(ObjectUtils.defaultIfNull(customerDto.getPhoneNumber(), oldPhoneNumber));
            String oldIdCard = customer.getIdCard();
            customer.setIdCard(oldIdCard);
            Date oldDateOfBirth = customer.getDateOfBirth();
            customer.setDateOfBirth(ObjectUtils.defaultIfNull(customerDto.getDateOfBirth(), oldDateOfBirth));
            customerRepository.save(customer);
            CustomerDto response = customerConverter.entityToDto(customer);
            return ResponsePayload.builder()
                    .message("Edit customer successfully!!!")
                    .status(HttpStatus.OK)
                    .data(response)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Edit customer failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

}


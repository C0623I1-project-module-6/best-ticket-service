package com.codegym.bestticket.service.impl.user.customer;

import com.codegym.bestticket.converter.customer.CustomerConverter;
import com.codegym.bestticket.entity.user.customer.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.request.CustomerRequest;
import com.codegym.bestticket.payload.response.user.customer.CustomerResponse;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.repository.user.customer.ICustomerRepository;
import com.codegym.bestticket.service.ICustomerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class CustomerService implements ICustomerService {
    private final CustomerConverter customerConverter;
    private final ICustomerRepository customerRepository;
    private final IUserRepository userRepository;

    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        UUID userid = customerRequest.getUser();
        User user = userRepository.findById(userid)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        Customer customer = customerConverter.dtoToEntity(customerRequest);
        customer.setUser(user);
        customer.setIsDeleted(false);
        customerRepository.save(customer);
        return customerConverter.entityToDto(customer);
    }

    @Override
    public CustomerResponse update(UUID id, CustomerRequest customerRequest) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty()) {
            throw new EntityNotFoundException("Customer not found is" + id);
        }
        Customer customer = optionalCustomer.get();
        String oldIdCard = customer.getIdCard();
        customerConverter.dtoToEntity(customerRequest);
        customer.setIdCard(oldIdCard);
        customerRepository.save(customer);
        return customerConverter.entityToDto(customer);
    }

    @Override
    public void remove(UUID id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer is not found"));
        customer.setIsDeleted(true);
        customerRepository.save(customer);
    }

    @Override
    public void delete(UUID id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerResponse> findAll() {
        return customerConverter.entitiesToDTOs(
                customerRepository.findAllByIsDeletedFalse());
    }

    @Override
    public CustomerResponse findById(UUID id) {
        Customer customer =
                customerRepository.findByIdAndIsDeletedFalse(id);
        if (customer != null) {
            return customerConverter.entityToDto(customer);
        } else {
            throw new EntityNotFoundException("Customer not found or is deleted");
        }
    }

}

package com.codegym.bestticket.service.impl.customer;

import com.codegym.bestticket.converter.user.impl.CustomerConverter;
import com.codegym.bestticket.dto.request.customer.CustomerRequestDTO;
import com.codegym.bestticket.dto.response.customer.CustomerResponseDTO;
import com.codegym.bestticket.entity.customer.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.repository.customer.ICustomerRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
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
    public CustomerResponseDTO create(CustomerRequestDTO customerRequestDTO) {
        UUID userid = customerRequestDTO.getUser();
        User user = userRepository.findById(userid)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        Customer customer = customerConverter.dtoToEntity(customerRequestDTO);
        customer.setUser(user);
        customer.setIsDeleted(false);
        customerRepository.save(customer);
        return customerConverter.entityToDto(customer);
    }

    @Override
    public CustomerResponseDTO update(UUID id, CustomerRequestDTO customerRequestDTO) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty()) {
            throw new EntityNotFoundException("Customer not found is" + id);
        }
        Customer customer = optionalCustomer.get();
        String oldIdCard= customer.getIdCard();
        customerConverter.dtoToEntity(customerRequestDTO);
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
    public List<CustomerResponseDTO> findAll() {
        return customerConverter.entitiesToDTOs(
                customerRepository.findAllByIsDeletedFalse());
    }

    @Override
    public CustomerResponseDTO findById(UUID id) {
        Customer customer =
                customerRepository.findByIdAndIsDeletedFalse(id);
        if (customer != null) {
            return customerConverter.entityToDto(customer);
        } else {
            throw new EntityNotFoundException("Customer not found or is deleted");
        }
    }

}

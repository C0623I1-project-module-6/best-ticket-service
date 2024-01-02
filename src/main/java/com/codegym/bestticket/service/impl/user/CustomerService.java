package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.CustomerConverter;
import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.repository.ICustomerRepository;
import com.codegym.bestticket.repository.IUserRepository;
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
    public CustomerDtoResponse create(CustomerDTO customerDTO) {
        UUID userid = customerDTO.getUser();
        User user = userRepository.findById(userid)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        Customer customer = customerConverter.dtoToEntity(customerDTO);
        customer.setUser(user);
        customer.setIsDelete(false);
        customerRepository.save(customer);
        return customerConverter.entityToDto(customer);
    }

    @Override
    public CustomerDtoResponse update(UUID id, CustomerDTO customerDTO) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty()) {
            throw new EntityNotFoundException("Customer not found is" + id);
        }
        Customer customer = optionalCustomer.get();
        String oldIdCard= customer.getIdCard();
        customerConverter.dtoToEntity(customerDTO);
        customer.setIdCard(oldIdCard);
        customerRepository.save(customer);
        return customerConverter.entityToDto(customer);
    }

    @Override
    public void remove(UUID id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer is not found"));
        customer.setIsDelete(true);
        customerRepository.save(customer);
    }

    @Override
    public void delete(UUID id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerDtoResponse> findAll() {
        return customerConverter.entitiesToDTOs(
                customerRepository.findAllByIsDeleteFalse());
    }

    @Override
    public CustomerDtoResponse findById(UUID id) {
        Customer customer =
                customerRepository.findByIdAndIsDeleteFalse(id);
        if (customer != null) {
            return customerConverter.entityToDto(customer);
        } else {
            throw new EntityNotFoundException("Customer not found or is deleted");
        }
    }

}

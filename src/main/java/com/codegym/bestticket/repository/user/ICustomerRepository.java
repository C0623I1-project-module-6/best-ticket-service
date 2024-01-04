package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ICustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findAllByIsDeletedFalse();

    Optional<Customer> findByUserIdAndIsDeletedFalse(UUID id);

    Optional<Customer> findByIdAndIsDeletedFalse(UUID id);

    Customer findByPhoneNumber(String phoneNumber);
}
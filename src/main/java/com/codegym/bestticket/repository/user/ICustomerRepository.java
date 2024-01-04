package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;


public interface ICustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findAllByIsDeletedFalse();

    Customer findByIdAndIsDeletedFalse(UUID id);
}

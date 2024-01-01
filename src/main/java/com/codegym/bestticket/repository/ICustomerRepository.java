package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findAllByIsDeleteFalse();

    Customer findByIdAndIsDeleteFalse(UUID id);
}

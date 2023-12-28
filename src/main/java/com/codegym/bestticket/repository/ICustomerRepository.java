package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICustomerRepository extends JpaRepository<Customer, UUID> {
}
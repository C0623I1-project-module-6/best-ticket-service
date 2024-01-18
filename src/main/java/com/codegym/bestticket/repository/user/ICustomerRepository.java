package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;


public interface ICustomerRepository extends JpaRepository<Customer, UUID> {
    Page<Customer> findAllByIsDeletedFalse(Pageable pageable);

    Optional<Customer> findByUserIdAndIsDeletedFalse(UUID id);

    Optional<Customer> findByIdAndIsDeletedFalse(UUID id);

    Customer findByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumber(String phoneNumber);
    boolean existsByIdCard(String idCard);
}

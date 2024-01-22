package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface IOrganizerRepository extends JpaRepository<Organizer, UUID> {
    Page<Organizer> findAllByIsDeletedFalse(Pageable pageable);

    Page<User> searchUserByIsDeletedFalseAndOrganizerTypeContaining(Pageable pageable,
                                                                    @Param("status") String status);

    Optional<Organizer> findByUserId(UUID id);

    Optional<Organizer> findByUserIdAndIsDeletedFalse(UUID id);

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByEmail(String email);

    boolean existsByTaxCode(String taxCode);

    boolean existsByBusinessCode(String businessCode);
}

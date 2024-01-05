package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.OrganizerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IOrganizerTypeRepository extends JpaRepository<OrganizerType, UUID> {
    Page<OrganizerType> findAllByNameContainingAndIsDeletedFalse(Pageable pageable, String status);
}

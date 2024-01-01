package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.user.OrganizerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IOrganizerTypeRepository extends JpaRepository<OrganizerType, UUID> {
}

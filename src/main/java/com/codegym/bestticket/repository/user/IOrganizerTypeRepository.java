package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.OrganizerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface IOrganizerTypeRepository extends JpaRepository<OrganizerType, UUID> {

}

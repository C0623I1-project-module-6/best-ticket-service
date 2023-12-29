package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.user.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IEnterpriseRepository extends JpaRepository<Enterprise, UUID> {
}

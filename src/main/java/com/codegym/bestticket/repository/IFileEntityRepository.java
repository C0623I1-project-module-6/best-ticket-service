package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IFileEntityRepository extends JpaRepository<FileEntity, Long> {

}

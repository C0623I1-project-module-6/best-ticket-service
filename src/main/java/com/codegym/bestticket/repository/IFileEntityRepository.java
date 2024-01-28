package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFileEntityRepository extends JpaRepository<FileEntity, Long> {
}

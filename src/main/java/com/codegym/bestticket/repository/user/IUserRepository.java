package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {
    @Query(nativeQuery = true,
            value = "SELECT r.name FROM roles r " +
                    "INNER JOIN users u ON r.id = u.role_id " +
                    "WHERE u.username = :username")
    List<String> findRolesByUsername(@Param("username") String username);
    User findByUsername(String username);

    User findByEmail(String email);

    Page<User> findAllByIsDeletedFalse(Pageable pageable);


    Page<User> findAllByUsernameContainingOrEmailContainingAndIsDeletedFalse(Pageable pageable, String username, String email);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}


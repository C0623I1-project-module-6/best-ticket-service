package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {
    @Query(nativeQuery = true,
            value = " SELECT r.name FROM roles r " +
                    " INNER JOIN user_roles ur ON r.id= ur.role_id" +
                    " INNER JOIN users u ON ur.user_id = u.id " +
                    " WHERE u.username = :username")
    List<String> findRolesByUsername(@Param("username") String username);

    @Query("SELECT r.name FROM Role r " +
            "JOIN Customer c " +
            "JOIN c.user.roles " +
            "WHERE c.phoneNumber = :phoneNumber")
    List<String> findRolesByPhoneNumber(@Param("phoneNumber") String phoneNumber);

    @Query(nativeQuery = true,
            value = " SELECT r.name FROM roles r " +
                    " INNER JOIN user_roles ur ON r.id= ur.role_id" +
                    " INNER JOIN users u ON ur.user_id = u.id " +
                    " WHERE u.email = :email")
    List<String> findRolesByEmail(@Param("email") String email);

    User findByUsername(String username);

    User findByEmail(String email);


    User findUserByRememberToken(String token);

    Page<User> findAllByIsDeletedFalse(Pageable pageable);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    Page<User> searchUserByIsDeletedFalseAndCreatedContaining(Pageable pageable,
                                                              @Param("status") String status);

    Page<User> searchUserByIsDeletedFalseAndUsernameContaining(Pageable pageable,
                                                               @Param("status") String status);

    Page<User> searchUserByIsDeletedFalseAndIsActivatedContaining(Pageable pageable,
                                                                  @Param("status") String status);

    Page<User> searchUserByIsDeletedFalseAndRolesContaining(Pageable pageable,
                                                            @Param("status") String status, String role);

    Page<User> searchUserByIsDeletedFalseAndCustomerFullNameContaining(Pageable pageable,
                                                                       @Param("status") String status);

    Page<User> searchUserByIsDeletedFalseAndOrganizerNameContaining(Pageable pageable,
                                                                    @Param("status") String status);
}


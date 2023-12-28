package com.codegym.bestticket.entity.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "username", length = 50, nullable = false, unique = true)
    private String username;
    @Column(name = "password", length = 50, nullable = false)
    private String password;
    @OneToOne(mappedBy = "user")
    private Customer customer;
    @OneToOne(mappedBy = "user")
    private Enterprise organizer;
    @OneToOne(mappedBy = "user")
    private Individual individual;
    @OneToMany(mappedBy = "user")
    private List<BankAccount> bankAccounts;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


}

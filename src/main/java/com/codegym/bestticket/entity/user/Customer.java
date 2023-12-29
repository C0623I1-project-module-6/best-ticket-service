package com.codegym.bestticket.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;
    @Column(length = 15)
    private String gender;
    @Column(name = "id_card", length = 50, unique = true)
    private String idCard;
    @Column(name = "date_of_birth", length = 15)
    private String dateOfBirth;
    @OneToOne
    @JoinColumn(name = "user_customer_id")
    private User user;
}

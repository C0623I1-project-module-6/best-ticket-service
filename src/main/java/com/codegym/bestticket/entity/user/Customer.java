package com.codegym.bestticket.entity.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Builder
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
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;
}

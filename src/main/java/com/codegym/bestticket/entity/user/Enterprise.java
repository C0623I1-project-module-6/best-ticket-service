package com.codegym.bestticket.entity.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "enterprises")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "tax_code", length = 50, nullable = false, unique = true)
    private String taxCode;
    @Column(name = "phone_number", length = 15, nullable = false, unique = true)
    private String phoneNumber;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "is_delete")
    private Boolean isDelete;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}

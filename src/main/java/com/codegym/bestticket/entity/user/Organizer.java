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
@Table(name = "organizers")
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;
    @Column(name = "id_card",length = 50, nullable = false,unique = true)
    private String idCard;
    @Column(name = "phone_number",length = 15,nullable = false,unique = true)
    private String phoneNumber;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}

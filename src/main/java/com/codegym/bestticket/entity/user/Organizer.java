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
    @Column(length = 50, nullable = false)
    private String name;
    @Column(name = "phone_number", length =  50, nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name = "id_card", length = 50,unique = true)
    private String idCard;
    @Column(name = "tax_code", length = 50, unique = true)
    private String taxCode;
    @ManyToOne
    @JoinColumn(name = "organizer_type_id")
    private OrganizerType organizerTypeId;
    @Column(name = "is_delete")
    private Boolean isDelete;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;


}

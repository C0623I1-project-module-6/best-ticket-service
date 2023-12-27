package com.codegym.bestticket.entity.user;

import com.codegym.bestticket.constant.ERole;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "name", length = 50)
    @Enumerated
    private ERole name;
    @ManyToMany(mappedBy = "users")
    private List<User> users;

}

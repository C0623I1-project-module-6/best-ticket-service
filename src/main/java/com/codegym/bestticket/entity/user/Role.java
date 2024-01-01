package com.codegym.bestticket.entity.user;
import jakarta.persistence.Entity;
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
    @Column( length = 50)
    private String name;
    @Column(name = "is_delete")
    private Boolean isDelete;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

}

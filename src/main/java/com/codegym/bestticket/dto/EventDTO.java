package com.codegym.bestticket.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {

    private UUID id;

    private String name;

    private String address;

    private String description;

    private String image;

    private String duration;

    private Boolean isDeleted;


}

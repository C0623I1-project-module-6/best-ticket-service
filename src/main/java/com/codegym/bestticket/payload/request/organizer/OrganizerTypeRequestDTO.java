package com.codegym.bestticket.payload.request.organizer;


import lombok.Data;

import java.util.UUID;
@Data
public class OrganizerTypeRequestDTO {
    private UUID id;
    private String name;
}

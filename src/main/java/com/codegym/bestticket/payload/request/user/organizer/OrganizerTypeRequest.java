package com.codegym.bestticket.payload.request.user.organizer;


import lombok.Data;

import java.util.UUID;
@Data
public class OrganizerTypeRequest {
    private UUID id;
    private String name;
}

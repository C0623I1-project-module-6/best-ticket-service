package com.codegym.bestticket.dto.location;

import lombok.Data;

import java.util.UUID;

@Data
public class LocationDTO {
    private UUID id;

    private String province;

    private String district;

    private String address;

}

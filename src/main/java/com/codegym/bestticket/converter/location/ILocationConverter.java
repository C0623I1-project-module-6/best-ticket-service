package com.codegym.bestticket.converter.location;

import com.codegym.bestticket.dto.event.EventTypeDTO;
import com.codegym.bestticket.dto.location.LocationDTO;
import com.codegym.bestticket.entity.event.EventType;
import com.codegym.bestticket.entity.location.Location;

import java.util.List;

public interface ILocationConverter {
    LocationDTO entityToDTO(Location element);

    List<LocationDTO> entitiesToDTOs(List<Location> element);

    Location dtoToEntity(LocationDTO element);
}

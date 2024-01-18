package com.codegym.bestticket.converter.location.impl;

import com.codegym.bestticket.converter.location.ILocationConverter;
import com.codegym.bestticket.dto.location.LocationDTO;
import com.codegym.bestticket.entity.location.Location;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class LocationConverter implements ILocationConverter {

    @Override
    public LocationDTO entityToDTO(Location element) {
        LocationDTO result = new LocationDTO();
        BeanUtils.copyProperties(element, result);
        return result;
    }

    @Override
    public List<LocationDTO> entitiesToDTOs(List<Location> elements) {
        return elements.stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Location dtoToEntity(LocationDTO element) {
        Location result = new Location();
        BeanUtils.copyProperties(element, result);
        return result;
    }
}

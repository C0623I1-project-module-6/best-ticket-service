package com.codegym.bestticket.repository.location;

import com.codegym.bestticket.entity.location.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ILocationRepository extends JpaRepository<Location, UUID> {
    boolean existsByProvinceAndDistrictAndAddress(String province, String district, String address);
    Location findByProvinceAndDistrictAndAddress(String province, String district, String address);

}

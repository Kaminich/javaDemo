package com.kaminich.productmanagement.service.impl;

import com.kaminich.productmanagement.entity.Location;
import com.kaminich.productmanagement.payload.response.LocationListResponse;
import com.kaminich.productmanagement.repository.LocationRepository;
import com.kaminich.productmanagement.service.ILocation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationService implements ILocation {

    private final LocationRepository locationRepository;

    @Override
    public Page<LocationListResponse> getAllLocation(int page, int size) {
        Pageable pageRequest = PageRequest.of(page, size);
        Page<Location> locations;
        locations = locationRepository.findAll(pageRequest);
        return locations.map(location -> new LocationListResponse());
    }
}

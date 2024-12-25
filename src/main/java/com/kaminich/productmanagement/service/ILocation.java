package com.kaminich.productmanagement.service;

import com.kaminich.productmanagement.payload.response.LocationListResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocation {
    Page<LocationListResponse> getAllLocation(int page, int size);
}

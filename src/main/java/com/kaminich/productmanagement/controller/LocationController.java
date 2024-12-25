package com.kaminich.productmanagement.controller;

import com.kaminich.productmanagement.payload.response.ApiResponse;
import com.kaminich.productmanagement.payload.response.LocationListResponse;
import com.kaminich.productmanagement.service.impl.LocationService;
import com.kaminich.productmanagement.utils.AppConstants;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.endpoint.base-url}/location")
@RequiredArgsConstructor
@Tag(name = "Location Controller")
public class LocationController {

    private final LocationService locationService;

    @GetMapping()
    public ResponseEntity<ApiResponse<Page<LocationListResponse>>> getAllLocation(
            @RequestParam(defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) int page,
            @RequestParam(defaultValue = AppConstants.DEFAULT_PAGE_SIZE) int size
    ) {
        ApiResponse<Page<LocationListResponse>> response = new ApiResponse<>(
                HttpStatus.OK,
                "Get all locations successfully",
                locationService.getAllLocation(page, size)
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

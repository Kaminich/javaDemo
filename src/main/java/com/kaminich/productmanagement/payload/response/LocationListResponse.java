package com.kaminich.productmanagement.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationListResponse {
    private Short locationId;
    private String locationName;
    private String costRate;
    private Double availability;

}

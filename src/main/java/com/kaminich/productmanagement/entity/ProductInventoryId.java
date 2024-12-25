package com.kaminich.productmanagement.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class ProductInventoryId implements Serializable {

    private Integer productID;
    private Short locationID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductInventoryId that)) return false;
        return Objects.equals(productID, that.productID) && Objects.equals(locationID, that.locationID);
    }

    @Override
    public int hashCode() {
        return 31 * productID + locationID;
    }
}


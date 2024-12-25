package com.kaminich.productmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class ProductCostHistoryId implements Serializable {

    private Integer productID;
    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductCostHistoryId that)) return false;
        return Objects.equals(productID, that.productID) && startDate.equals(that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, startDate);
    }
}


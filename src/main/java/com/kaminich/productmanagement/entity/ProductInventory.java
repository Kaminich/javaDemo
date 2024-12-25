package com.kaminich.productmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "productInventory")
public class ProductInventory {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ProductInventoryId productInventoryId;
    @ManyToOne
    @MapsId("productID")
    @JoinColumn(name = "productID")
    private Product product;
    @ManyToOne
    @MapsId("locationID")
    @JoinColumn(name = "locationID")
    private Location location;
    private String shelf;
    private Byte bin;
    private Short quantity;
}

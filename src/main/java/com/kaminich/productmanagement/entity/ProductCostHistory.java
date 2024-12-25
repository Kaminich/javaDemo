package com.kaminich.productmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "productCostHistory")
public class ProductCostHistory {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ProductCostHistoryId productCostHistoryId;
    @ManyToOne
    @MapsId("productID")
    @JoinColumn(name = "productID")
    private Product product;
    @Column(name = "endDate")
    private LocalDate endDate;
    @Column(columnDefinition = "money")
    private String cost;
}

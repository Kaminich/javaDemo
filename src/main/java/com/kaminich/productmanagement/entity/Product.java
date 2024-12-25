package com.kaminich.productmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productID")
    private Integer productId;
    private String name;
    private String color;
    @Column(columnDefinition = "money")
    private Integer cost;
    @Column(columnDefinition = "money")
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "subcategoryID")
    private ProductSubcategory productSubcategory;
    @ManyToOne
    @JoinColumn(name = "modelID")
    private ProductModel productModel;
    @Column(name = "sellStartDate")
    private LocalDateTime sellStartDate;
    @Column(name = "sellEndDate")
    private LocalDateTime sellENdDate;
}

package com.kaminich.productmanagement.repository;

import com.kaminich.productmanagement.entity.ProductSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSubcategoryRepository extends JpaRepository<ProductSubcategory, Integer> {
}

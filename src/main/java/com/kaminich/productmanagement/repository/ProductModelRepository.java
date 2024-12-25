package com.kaminich.productmanagement.repository;

import com.kaminich.productmanagement.entity.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductModelRepository extends JpaRepository<ProductModel, Integer> {
}

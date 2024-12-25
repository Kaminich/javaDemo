package com.kaminich.productmanagement.repository;

import com.kaminich.productmanagement.entity.ProductInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Integer> {
}

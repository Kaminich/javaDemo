package com.kaminich.productmanagement.repository;

import com.kaminich.productmanagement.entity.ProductCostHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCostHistoryRepository extends JpaRepository<ProductCostHistory, Long> {
}

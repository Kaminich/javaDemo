package com.kaminich.productmanagement.repository;

import com.kaminich.productmanagement.entity.ProductPriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceHistoryRepository extends JpaRepository<ProductPriceHistory, Integer> {
}

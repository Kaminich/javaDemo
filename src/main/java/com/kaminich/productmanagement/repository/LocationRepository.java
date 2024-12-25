package com.kaminich.productmanagement.repository;

import com.kaminich.productmanagement.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LocationRepository extends JpaRepository<Location, Short> {
//    Page<Location> findAllByOrderByLocationNameAsc(Pageable pageable);
}

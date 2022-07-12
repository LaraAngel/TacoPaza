package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.FoodProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodProductRepository extends JpaRepository<FoodProductEntity, Long> {
}

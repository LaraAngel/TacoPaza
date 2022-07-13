package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.FoodProductOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodProducrOrderRepository extends JpaRepository<FoodProductOrderEntity,Long> {
}

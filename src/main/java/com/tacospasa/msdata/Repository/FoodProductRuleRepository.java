package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.FoodProductRuleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodProductRuleRepository extends JpaRepository<FoodProductRuleEntity, Long> {
    @Query("select foodPR from FoodProductRuleEntity foodPR where foodPR.status =   :status")
    List<FoodProductRuleEntity> getFoodProductRuleEntitiesByStatus(@Param("status")StatusEntity status);
}

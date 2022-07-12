package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.FoodCategoryEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodCategoryRepository extends JpaRepository<FoodCategoryEntity,Long> {
    @Query("Select foodC from FoodCategoryEntity foodC where foodC.status =:status")
    public List<FoodCategoryEntity> getFoodCategoryEntitiesByStatus(@Param("status") StatusEntity status);
}

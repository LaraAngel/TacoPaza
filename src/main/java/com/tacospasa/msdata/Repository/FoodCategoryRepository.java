package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.DepartmentEntity;
import com.tacospasa.msdata.Entity.FoodCategoryEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.FoodCategoryServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodCategoryRepository extends JpaRepository<FoodCategoryEntity,Long> {
    @Query("Select foodC from FoodCategoryEntity foodC where foodC.status =:status")
    public List<FoodCategoryEntity> getFoodCategoryEntitiesByStatus(@Param("status") StatusEntity status);
    @Query("select fc from FoodCategoryEntity fc where fc.id =:id")
    FoodCategoryEntity getFoodCategoryById(@Param("id") Long id);
}

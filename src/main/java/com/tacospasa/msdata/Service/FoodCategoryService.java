package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodCategoryEntity;
import com.tacospasa.msdata.Entity.StatusEntity;

import java.util.List;

public interface FoodCategoryService {
    FoodCategoryEntity getFoodCategoryById(Long id);
    List<FoodCategoryEntity> getAllFoodCategory();
    FoodCategoryEntity createFoodCategory(FoodCategoryEntity foodCategory);
    FoodCategoryEntity updateFoodCategory(FoodCategoryEntity foodCategory);
    List<FoodCategoryEntity> getAllFoodCategoryByStatus(StatusEntity status);
}

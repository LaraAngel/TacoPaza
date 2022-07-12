package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodProductEntity;

import java.util.List;

public interface FoodProductService {
    FoodProductEntity getFoodProductById(Long id);
    List<FoodProductEntity> getAllFoodProduct();
    FoodProductEntity createFoodProduct(FoodProductEntity product);
    FoodProductEntity updateFoodProduct(FoodProductEntity product);
}
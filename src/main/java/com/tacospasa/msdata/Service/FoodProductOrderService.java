package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodProductOrderEntity;

import java.util.List;

public interface FoodProductOrderService {
    FoodProductOrderEntity getFoodProductOrderById(Long id);
    List<FoodProductOrderEntity> getAllFoodProductOrder();
    FoodProductOrderEntity createFoodProductOrder(FoodProductOrderEntity order);
    FoodProductOrderEntity updateFoodProductOrder(FoodProductOrderEntity order);
}


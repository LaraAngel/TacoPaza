package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodProductRuleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;

import java.util.List;

public interface FoodProductRuleService {
    FoodProductRuleEntity getFoodProductRuleById(Long id);
    List<FoodProductRuleEntity> getAllFoodProductRule();
    FoodProductRuleEntity createFoodProductRule(FoodProductRuleEntity ruleEntity);
    FoodProductRuleEntity updateFoodProductRule(FoodProductRuleEntity ruleEntity);
    List<FoodProductRuleEntity> getAllFoodProductRuleByStatus(StatusEntity status);
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodProductRuleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Repository.FoodProductRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodProductRuleServiceImpl implements FoodProductRuleService{
    @Autowired
    private FoodProductRuleRepository repository;
    @Override
    public FoodProductRuleEntity getFoodProductRuleById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<FoodProductRuleEntity> getAllFoodProductRule() {
        return repository.findAll();
    }

    @Override
    public FoodProductRuleEntity createFoodProductRule(FoodProductRuleEntity ruleEntity) {
        return repository.saveAndFlush(ruleEntity);
    }

    @Override
    public FoodProductRuleEntity updateFoodProductRule(FoodProductRuleEntity ruleEntity) {
        return repository.saveAndFlush(ruleEntity);
    }

    @Override
    public List<FoodProductRuleEntity> getAllFoodProductRuleByStatus(StatusEntity status) {
        return repository.getFoodProductRuleEntitiesByStatus(status);
    }
}

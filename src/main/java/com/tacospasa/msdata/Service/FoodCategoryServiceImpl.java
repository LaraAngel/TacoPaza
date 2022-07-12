package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodCategoryEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Repository.FoodCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodCategoryServiceImpl implements FoodCategoryService{
    @Autowired
    private FoodCategoryRepository repository;
    @Override
    public FoodCategoryEntity getFoodCategoryById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<FoodCategoryEntity> getAllFoodCategory() {
        return repository.findAll();
    }

    @Override
    public FoodCategoryEntity createFoodCategory(FoodCategoryEntity foodCategory) {
        return repository.saveAndFlush(foodCategory);
    }

    @Override
    public FoodCategoryEntity updateFoodCategory(FoodCategoryEntity foodCategory) {
        return repository.saveAndFlush(foodCategory);
    }

    @Override
    public List<FoodCategoryEntity> getAllFoodCategoryByStatus(StatusEntity status) {
        return repository.getFoodCategoryEntitiesByStatus(status);
    }
}

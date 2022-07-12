package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodProductEntity;
import com.tacospasa.msdata.Repository.FoodProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodProductServiceImpl implements FoodProductService{
    @Autowired
    private FoodProductRepository repository;
    @Override
    public FoodProductEntity getFoodProductById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<FoodProductEntity> getAllFoodProduct() {
        return repository.findAll();
    }

    @Override
    public FoodProductEntity createFoodProduct(FoodProductEntity product) {
        return repository.saveAndFlush(product);
    }

    @Override
    public FoodProductEntity updateFoodProduct(FoodProductEntity product) {
        return repository.saveAndFlush(product);
    }
}

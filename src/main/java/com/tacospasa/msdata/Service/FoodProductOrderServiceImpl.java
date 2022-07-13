package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodProductOrderEntity;
import com.tacospasa.msdata.Repository.FoodProducrOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodProductOrderServiceImpl implements FoodProductOrderService{
    @Autowired
    private FoodProducrOrderRepository repository;
    @Override
    public FoodProductOrderEntity getFoodProductOrderById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<FoodProductOrderEntity> getAllFoodProductOrder() {
        return repository.findAll();
    }

    @Override
    public FoodProductOrderEntity createFoodProductOrder(FoodProductOrderEntity order) {
        return repository.saveAndFlush(order);
    }

    @Override
    public FoodProductOrderEntity updateFoodProductOrder(FoodProductOrderEntity order) {
        return repository.saveAndFlush(order);
    }
}

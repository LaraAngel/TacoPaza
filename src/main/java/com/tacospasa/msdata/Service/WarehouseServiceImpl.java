package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.WarehouseEntity;
import com.tacospasa.msdata.Repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService{
    @Autowired private WarehouseRepository repository;


    @Override
    public List<WarehouseEntity> getAllWarehouses() {return repository.findAll();}
    @Override
    public WarehouseEntity getWarehouseById(Long id) {
        return repository.findById(id);
    }
    @Override
    public WarehouseEntity createNewWarehouse(WarehouseEntity warehouse) {
        return repository.saveAndFlush(warehouse);
    }
    @Override
    public WarehouseEntity updateWarehouse(WarehouseEntity warehouse) {
        return repository.saveAndFlush(warehouse);
    }
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.WarehouseEntity;

import java.util.List;

public interface WarehouseService {
    List<WarehouseEntity> getAllWarehouses();
    WarehouseEntity getWarehouseById(Long id);
    WarehouseEntity createNewWarehouse(WarehouseEntity warehouse);
    WarehouseEntity deleteWarehouseById(Long id);
}

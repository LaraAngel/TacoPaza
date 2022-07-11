package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.*;

import java.util.Date;
import java.util.List;

public interface InventoryProductService {
    InventoryProductEntity getInventoryProductById(Long id);
    List<InventoryProductEntity> getAllProductInventory();
    List<InventoryProductEntity> getAllProductInventoryByExpirationDate(Date date);
    List<InventoryProductEntity> getAllProductInventoryByInputDate(Date date);
    List<InventoryProductEntity> getAllProductInventoryByStatus(Long id);
    List<InventoryProductEntity> getAllProductInventoryByProvider(Long id);
    List<InventoryProductEntity> getAllProductInventoryByDepartment(Long id);
    List<InventoryProductEntity> getAllProductInventoryByPresentation(Long id);
    List<InventoryProductEntity> getAllProductInventoryByWareHouse(Long id);
    List<InventoryProductEntity> getAllProductInventoryByBranch(Long id);
    InventoryProductEntity getProductInventoryByName(String name);
    InventoryProductEntity updateInventoryProduct(InventoryProductEntity inventoryProduct);
    InventoryProductEntity createInventoryProduct(InventoryProductEntity inventoryProduct);
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.InventoryProductEntity;
import com.tacospasa.msdata.Repository.InventoryProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class InventoryProductServiceImpl implements InventoryProductService{
    @Autowired
    private InventoryProductRepository repository;
    @Override
    public InventoryProductEntity getInventoryProductById(Long id){return repository.getReferenceById(id);}
    @Override
    public List<InventoryProductEntity> getAllProductInventory(){return repository.findAll();}
    @Override
    public List<InventoryProductEntity> getAllProductInventoryByExpirationDate(Date date){return repository.findByExpirationDate(date);}
    @Override
    public List<InventoryProductEntity> getAllProductInventoryByInputDate(Date date){return repository.findByInputDate(date);}
    @Override
    public List<InventoryProductEntity> getAllProductInventoryByStatus(Long id){return repository.findAllByStatusId(id);}
    @Override
    public List<InventoryProductEntity> getAllProductInventoryByProvider(Long id){return repository.findAllByProviderId(id);}
    @Override
    public List<InventoryProductEntity> getAllProductInventoryByDepartment(Long id){return repository.findAllByDepartmentId(id);}
    @Override
    public List<InventoryProductEntity> getAllProductInventoryByPresentation(Long id){return repository.findAllByPresentationId(id);}
    @Override
    public List<InventoryProductEntity> getAllProductInventoryByWareHouse(Long id){return repository.findAllByWarehouseId(id);}

    @Override
    public List<InventoryProductEntity> getAllProductInventoryByBranch(Long id) {return repository.findAllByBranchId(id);}

    @Override
    public InventoryProductEntity getProductInventoryByName(String name){return repository.findByInventoryProductName(name);}
    @Override
    public InventoryProductEntity updateInventoryProduct(InventoryProductEntity inventoryProduct){return repository.saveAndFlush(inventoryProduct);}
    @Override
    public InventoryProductEntity createInventoryProduct(InventoryProductEntity inventoryProduct){return repository.saveAndFlush(inventoryProduct);}
}

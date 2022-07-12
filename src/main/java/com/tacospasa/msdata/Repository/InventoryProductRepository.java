package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.InventoryProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface InventoryProductRepository extends JpaRepository<InventoryProductEntity,Long> {
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.expirationDate =:date")
    List<InventoryProductEntity> findByExpirationDate(@Param("date") Date date);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.inputDate =:date")
    List<InventoryProductEntity> findByInputDate(@Param("date") Date date);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.provider.id =:id")
    List<InventoryProductEntity> findAllByProviderId(@Param("id") Long id);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.provider.id =:id")
    List<InventoryProductEntity> findAllByDepartmentId(@Param("id") Long id);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.presentation.id =:id")
    List<InventoryProductEntity> findAllByPresentationId(@Param("id") Long id);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.warehouse.id =:id")
    List<InventoryProductEntity> findAllByWarehouseId(@Param("id") Long id);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.branch.id =:id")
    List<InventoryProductEntity> findAllByBranchId(@Param("id") Long id);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.status.id =:id")
    List<InventoryProductEntity> findAllByStatusId(@Param("id") Long id);
    @Query("Select invPrd from InventoryProductEntity invPrd where invPrd.inventoryProductName =:name")
    InventoryProductEntity findByInventoryProductName(@Param("name")String name);

}

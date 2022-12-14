package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.WarehouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<WarehouseEntity, Integer> {
    WarehouseEntity deleteById(Long id);

    WarehouseEntity findById(Long id);
}

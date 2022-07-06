package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository extends JpaRepository<UnitEntity, Integer> {
    UnitEntity deleteById(Long id);

    UnitEntity findById(Long id);
}

package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.UnitMeasureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitMeasureRepository extends JpaRepository<UnitMeasureEntity, Integer> {
    UnitMeasureEntity deleteById(Long id);

    UnitMeasureEntity findById(Long id);
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.UnitEntity;

import java.util.List;

public interface UnitService {
    List<UnitEntity> getAllMeasurementUnits();
    UnitEntity createUnitMeasure(UnitEntity unitMeasure);
    UnitEntity deleteUnitMeasureById(Long id);
    UnitEntity getUnitMeasureById(Long id);
}

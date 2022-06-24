package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.UnitMeasureEntity;

import java.util.List;

public interface UnitMeasureService {
    List<UnitMeasureEntity> getAllMeasurementUnits();
    UnitMeasureEntity createUnitMeasure(UnitMeasureEntity unitMeasure);
    UnitMeasureEntity deleteUnitMeasureById(Long id);
    UnitMeasureEntity getUnitMeasureById(Long id);
}

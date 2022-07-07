package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.UnitEntity;

import java.util.List;

public interface UnitService {
    UnitEntity getUnitById(Long id);
    List<UnitEntity> getAllUnits();
    UnitEntity createUnit(UnitEntity unit);
    UnitEntity updateUnit(UnitEntity unit);
}

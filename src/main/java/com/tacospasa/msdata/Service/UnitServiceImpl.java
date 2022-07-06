package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.UnitEntity;
import com.tacospasa.msdata.Repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {
    @Autowired
    private UnitRepository repository;
    @Override
    public UnitEntity deleteUnitMeasureById(Long id) {return repository.deleteById(id);}
    @Override
    public List<UnitEntity> getAllMeasurementUnits() {return repository.findAll();    }
    @Override
    public UnitEntity getUnitMeasureById(Long id) {return repository.findById(id);    }

    @Override
    public UnitEntity createUnitMeasure(UnitEntity unitMeasure) {return repository.saveAndFlush(unitMeasure);    }
}

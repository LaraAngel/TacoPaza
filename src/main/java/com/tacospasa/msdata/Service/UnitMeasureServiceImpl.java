package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.UnitMeasureEntity;
import com.tacospasa.msdata.Repository.UnitMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitMeasureServiceImpl implements UnitMeasureService{
    @Autowired
    private UnitMeasureRepository repository;
    @Override
    public UnitMeasureEntity deleteUnitMeasureById(Long id) {return repository.deleteById(id);}
    @Override
    public List<UnitMeasureEntity> getAllMeasurementUnits() {return repository.findAll();    }
    @Override
    public UnitMeasureEntity getUnitMeasureById(Long id) {return repository.findById(id);    }

    @Override
    public UnitMeasureEntity createUnitMeasure(UnitMeasureEntity unitMeasure) {return repository.save(unitMeasure);    }
}

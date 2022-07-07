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
    public UnitEntity updateUnit(UnitEntity unit) {return repository.saveAndFlush(unit);}
    @Override
    public List<UnitEntity> getAllUnits() {return repository.findAll();    }
    @Override
    public UnitEntity getUnitById(Long id) {return repository.findById(id);    }
    @Override
    public UnitEntity createUnit(UnitEntity unit) {return repository.saveAndFlush(unit);    }
}

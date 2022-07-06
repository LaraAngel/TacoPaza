package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.UnitEntity;
import com.tacospasa.msdata.Service.UnitService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inventory")
public class UnitController {
    @Autowired
    private UnitService service;
    @ApiOperation(value = "get all measurement units", response = UnitEntity.class, tags = "Measurement units")
    @GetMapping(value = "/units")
    public List<UnitEntity> getAllMeasurementUnits(){return service.getAllMeasurementUnits();}
    @ApiOperation(value = "get measurement unit by it", response = UnitEntity.class, tags = "Measurement units")
    @GetMapping(value = "unit")
    public UnitEntity getUnitMeasureBuId(@RequestParam Long id){ return service.getUnitMeasureById(id);}
    @ApiOperation(value = "delete measurement unit by id", response = UnitEntity.class, tags = "Measurement units")
    @DeleteMapping(value = "unit")
    public UnitEntity deleteUnitMeasureById(@RequestParam Long id){return service.deleteUnitMeasureById(id);}
    @ApiOperation(value = "create measurement unit", response = UnitEntity.class, tags = "Measurement units")
    @PostMapping(value = "unit")
    public UnitEntity createUnitMeasure(@RequestParam UnitEntity unitMeasure){return service.createUnitMeasure(unitMeasure);}
}

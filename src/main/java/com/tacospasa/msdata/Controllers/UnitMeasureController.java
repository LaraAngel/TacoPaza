package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.UnitMeasureEntity;
import com.tacospasa.msdata.Service.UnitMeasureService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inventory")
public class UnitMeasureController {
    @Autowired
    private UnitMeasureService service;
    @ApiOperation(value = "get all measurement units", response = UnitMeasureEntity.class, tags = "Measurement units")
    @GetMapping(value = "/units")
    public List<UnitMeasureEntity> getAllMeasurementUnits(){return service.getAllMeasurementUnits();}
    @ApiOperation(value = "get measurement unit by it", response = UnitMeasureEntity.class, tags = "Measurement units")
    @GetMapping(value = "unit")
    public UnitMeasureEntity getUnitMeasureBuId(@RequestParam Long id){ return service.getUnitMeasureById(id);}
    @ApiOperation(value = "delete measurement unit by id", response = UnitMeasureEntity.class, tags = "Measurement units")
    @DeleteMapping(value = "unit")
    public UnitMeasureEntity deleteUnitMeasureById(@RequestParam Long id){return service.deleteUnitMeasureById(id);}
    @ApiOperation(value = "create measurement unit", response = UnitMeasureEntity.class, tags = "Measurement units")
    @PostMapping(value = "unit")
    public UnitMeasureEntity createUnitMeasure(@RequestParam UnitMeasureEntity unitMeasure){return service.createUnitMeasure(unitMeasure);}
}

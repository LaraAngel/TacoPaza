package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.UnitEntity;
import com.tacospasa.msdata.Service.UnitService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inventory")
@Api(tags = "Measurement units")
public class UnitController {
    @Autowired
    private UnitService service;
    @ApiOperation(value = "get all measurement units", response = UnitEntity.class, tags = "Measurement units")
    @GetMapping(value = "/units")
    public List<UnitEntity> getAllMeasurementUnits(){return service.getAllUnits();}
    @ApiOperation(value = "get measurement unit by id", response = UnitEntity.class, tags = "Measurement units")
    @GetMapping(value = "/unit/{id}")
    public UnitEntity getUnitMeasureBuId(@PathVariable Long id){ return service.getUnitById(id);}
    @ApiOperation(value = "update measurement unit by id", response = UnitEntity.class, tags = "Measurement units")
    @PutMapping(value = "/unit")
    public UnitEntity updateUnitMeasure(@RequestBody UnitEntity unit){return service.updateUnit(unit);}
    @ApiOperation(value = "create measurement unit", response = UnitEntity.class, tags = "Measurement units")
    @PostMapping(value = "/unit")
    public UnitEntity createUnitMeasure(@RequestParam UnitEntity unit){return service.createUnit(unit);}
}

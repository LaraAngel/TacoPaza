package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.WarehouseEntity;
import com.tacospasa.msdata.Service.WarehouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inventory")
@Api(tags = "Warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;
    @ApiOperation(value = "Get warehouse by ID", response = WarehouseEntity.class, tags = "Warehouse")
    @GetMapping(value = "/Warehouse/{id}")
    public WarehouseEntity getWarehouseById(@PathVariable Long id){return warehouseService.getWarehouseById(id);}
    @ApiOperation(value = "Get all warehouses", response = WarehouseEntity.class, tags = "Warehouse")
    @GetMapping(value = "/Warehouses")
    public List<WarehouseEntity> getAllWarehouses(){return warehouseService.getAllWarehouses();}
    @ApiOperation(value = "create warehouse", response = WarehouseEntity.class, tags = "Warehouse")
    @PostMapping(value = "/Warehouse")
    public WarehouseEntity createNewWarehouse(@RequestBody WarehouseEntity warehouse){return warehouseService.createNewWarehouse(warehouse);}
    @ApiOperation(value = "update warehouse", response = WarehouseEntity.class, tags = "Warehouse")
    @PutMapping(value = "/Warehouse")
    public WarehouseEntity deleteWarehouseById(@RequestBody WarehouseEntity warehouse){return warehouseService.updateWarehouse(warehouse);}
}

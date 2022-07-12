package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.InventoryProductEntity;
import com.tacospasa.msdata.Service.InventoryProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/inventory")
@Api(tags = "Inventory Product")
public class InventoryProductController {
    @Autowired
    private InventoryProductService invProdservice;

    @ApiOperation(value = "Get InventoryProduct by id", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product{id}")
    public ResponseEntity<InventoryProductEntity> getInventoryProductById(@PathVariable Long id){
        return new ResponseEntity<>(invProdservice.getInventoryProductById(id), HttpStatus.OK);
    }
    @ApiOperation(value = "Get all InventoryProduct", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-products")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventory(){
        return new ResponseEntity<>(invProdservice.getAllProductInventory(), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by expiration date", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/expiration-date")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByExpirationDate(@RequestParam Date date){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByExpirationDate(date), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by input date", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/input-date")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByInputDate(@RequestParam Date date){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByInputDate(date), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by status id", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/status")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByStatus(@RequestParam Long id){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByStatus(id),HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by provider id", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/provider")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByProvider(@RequestParam Long id){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByProvider(id), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by department id", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/department")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByDepartment(@RequestParam Long id){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByDepartment(id), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by presentation id", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/presentation")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByPresentation(@RequestParam Long id){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByPresentation(id), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by warehouse id", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/warehouse")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByWarehouse(@RequestParam Long id){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByWareHouse(id), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by branch id", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/branch")
    public ResponseEntity<List<InventoryProductEntity>> getAllProductInventoryByBranch(@RequestParam Long id){
        return new ResponseEntity<>(invProdservice.getAllProductInventoryByBranch(id), HttpStatus.OK);
    }
    @ApiOperation(value = "Get InventoryProduct by name", response = InventoryProductEntity.class, tags = "Inventory Product")
    @GetMapping(value = "/inventory-product/productName")
    public ResponseEntity<List<InventoryProductEntity>> getProductInventoryByName(@RequestParam String name){
        return new ResponseEntity<>((List<InventoryProductEntity>) invProdservice.getProductInventoryByName(name), HttpStatus.OK);
    }
    @ApiOperation(value = "create InventoryProduct", response = InventoryProductEntity.class, tags = "Inventory Product")
    @PostMapping(value = "/inventory-product")
    public ResponseEntity<InventoryProductEntity> createInventoryProduct(@RequestBody InventoryProductEntity inventoryProduct){return new ResponseEntity<>(invProdservice.createInventoryProduct(inventoryProduct), HttpStatus.OK);}
    @ApiOperation(value = "Update InventoryProduct", response = InventoryProductEntity.class, tags = "Inventory Product")
    @PutMapping(value = "/inventory-product")
    public ResponseEntity<InventoryProductEntity> updateInventoryProduct(@RequestBody InventoryProductEntity inventoryProduct){return new ResponseEntity<>(invProdservice.updateInventoryProduct(inventoryProduct), HttpStatus.OK);}
}
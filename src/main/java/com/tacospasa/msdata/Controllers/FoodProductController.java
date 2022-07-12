package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.FoodProductEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.FoodProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/food")
@Api(tags = "Food Product")
public class FoodProductController {
    @Autowired
    private FoodProductService productService;
    @ApiOperation(value = "get food product by id",response = FoodProductEntity.class,tags = "Food category")
    @GetMapping(value = "/product/{id}")
    public ResponseEntity<FoodProductEntity> getFoodProductById(@PathVariable Long id){return new ResponseEntity<>(productService.getFoodProductById(id), HttpStatus.OK);}
    @ApiOperation(value = "get all food product",response = FoodProductEntity.class,tags = "Food category")
    @GetMapping(value = "/products")
    public ResponseEntity<List<FoodProductEntity>> getAllFoodProduct(){return new ResponseEntity<>(productService.getAllFoodProduct(), HttpStatus.OK);}
    @ApiOperation(value = "create food product",response = FoodProductEntity.class,tags = "Food category")
    @PostMapping(value = "/product")
    public ResponseEntity<FoodProductEntity> createFoodProduct(@RequestParam FoodProductEntity foodProduct){return new ResponseEntity<>(productService.createFoodProduct(foodProduct), HttpStatus.OK);}
    @ApiOperation(value = "update food product",response = FoodProductEntity.class,tags = "Food category")
    @PutMapping(value = "/product")
    public ResponseEntity<FoodProductEntity> updateFoodProduct(@RequestParam FoodProductEntity foodProduct){return new ResponseEntity<>(productService.updateFoodProduct(foodProduct), HttpStatus.OK);}
}

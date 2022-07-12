package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.FoodCategoryEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.FoodCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/food")
@Api(tags = "Food category")
public class FoodCategoryController {
    @Autowired
    private FoodCategoryService service;
    @ApiOperation(value = "get food category by id",response = FoodCategoryEntity.class,tags = "Food category")
    @GetMapping(value = "/category/{id}")
    public ResponseEntity<FoodCategoryEntity> getFoodCategoryById(@PathVariable Long id){return new ResponseEntity<>(service.getFoodCategoryById(id), HttpStatus.OK);}
    @ApiOperation(value = "get all food category",response = FoodCategoryEntity.class,tags = "Food category")
    @GetMapping(value = "/categories")
    public ResponseEntity<List<FoodCategoryEntity>> getAllFoodCategory(){return new ResponseEntity<>(service.getAllFoodCategory(), HttpStatus.OK);}
    @ApiOperation(value = "create food category",response = FoodCategoryEntity.class,tags = "Food category")
    @PostMapping(value = "/category")
    public ResponseEntity<FoodCategoryEntity> createFoodCategory(@RequestParam FoodCategoryEntity foodCategory){return new ResponseEntity<>(service.createFoodCategory(foodCategory), HttpStatus.OK);}
    @ApiOperation(value = "get food category by id",response = FoodCategoryEntity.class,tags = "Food category")
    @PutMapping(value = "/category")
    public ResponseEntity<FoodCategoryEntity> updateFoodCategory(@RequestParam FoodCategoryEntity foodCategory){return new ResponseEntity<>(service.updateFoodCategory(foodCategory), HttpStatus.OK);}
    @ApiOperation(value = "get all food category by status",response = FoodCategoryEntity.class,tags = "Food category")
    @GetMapping(value = "/category/status")
    public ResponseEntity<List<FoodCategoryEntity>> getFoodCategoryByStatus(@RequestParam StatusEntity status){return new ResponseEntity<>(service.getAllFoodCategoryByStatus(status), HttpStatus.OK);}
}

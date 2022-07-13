package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.FoodProductOrderEntity;
import com.tacospasa.msdata.Service.FoodProductOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
@Api(tags = "Food Product Order")
public class FoodProductOrderController {
    @Autowired
    private FoodProductOrderService orderService;
    @ApiOperation(value = "get Food Product Order by id",response = FoodProductOrderEntity.class,tags = "Food Product Order")
    @GetMapping(value = "/product/{id}")
    public ResponseEntity<FoodProductOrderEntity> getFoodProductOrderById(@PathVariable Long id){return new ResponseEntity<>(orderService.getFoodProductOrderById(id), HttpStatus.OK);}
    @ApiOperation(value = "get all Food Product Order",response = FoodProductOrderEntity.class,tags = "Food Product Order")
    @GetMapping(value = "/products")
    public ResponseEntity<List<FoodProductOrderEntity>> getAllFoodProductOrder(){return new ResponseEntity<>(orderService.getAllFoodProductOrder(), HttpStatus.OK);}
    @ApiOperation(value = "create Food Product Order",response = FoodProductOrderEntity.class,tags = "Food Product Order")
    @PostMapping(value = "/product")
    public ResponseEntity<FoodProductOrderEntity> createFoodProductOrder(@RequestBody FoodProductOrderEntity order){return new ResponseEntity<>(orderService.createFoodProductOrder(order), HttpStatus.OK);}
    @ApiOperation(value = "update Food Product Order",response = FoodProductOrderEntity.class,tags = "Food Product Order")
    @PutMapping(value = "/product")
    public ResponseEntity<FoodProductOrderEntity> updateFoodProductOrder(@RequestBody FoodProductOrderEntity order){return new ResponseEntity<>(orderService.updateFoodProductOrder(order), HttpStatus.OK);}

}

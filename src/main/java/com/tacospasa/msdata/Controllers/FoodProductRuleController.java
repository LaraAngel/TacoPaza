package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.FoodProductRuleEntity;
import com.tacospasa.msdata.Entity.FoodProductRuleEntity;
import com.tacospasa.msdata.Entity.FoodProductRuleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.FoodProductRuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/food/product")
@Api(tags = "Food Product Rule")
public class FoodProductRuleController {
    @Autowired
    private FoodProductRuleService ruleService;
    @ApiOperation(value = "Get food product rule by id", response = FoodProductRuleEntity.class, tags = "Food Product Rule")
    @GetMapping(value = "/rule/{id}")
    public ResponseEntity<FoodProductRuleEntity> getFoodProductRuleById(@PathVariable Long id){return new ResponseEntity<>(ruleService.getFoodProductRuleById(id), HttpStatus.OK);}
    @ApiOperation(value = "get all Food Product Rule",response = FoodProductRuleEntity.class,tags = "Food Product Rule")
    @GetMapping(value = "/rules")
    public ResponseEntity<List<FoodProductRuleEntity>> getAllFoodProductRule(){return new ResponseEntity<>(ruleService.getAllFoodProductRule(), HttpStatus.OK);}
    @ApiOperation(value = "create Food Product Rule",response = FoodProductRuleEntity.class,tags = "Food Product Rule")
    @PostMapping(value = "/rule")
    public ResponseEntity<FoodProductRuleEntity> createFoodProductRule(@RequestBody FoodProductRuleEntity FoodProductRule){return new ResponseEntity<>(ruleService.createFoodProductRule(FoodProductRule), HttpStatus.OK);}
    @ApiOperation(value = "update Food Product Rule",response = FoodProductRuleEntity.class,tags = "Food Product Rule")
    @PutMapping(value = "/rule")
    public ResponseEntity<FoodProductRuleEntity> updateFoodProductRule(@RequestBody FoodProductRuleEntity FoodProductRule){return new ResponseEntity<>(ruleService.updateFoodProductRule(FoodProductRule), HttpStatus.OK);}
    @ApiOperation(value = "get all Food Product Rule by status",response = FoodProductRuleEntity.class,tags = "Food Product Rule")
    @GetMapping(value = "/rule/status")
    public ResponseEntity<List<FoodProductRuleEntity>> getFoodProductRuleByStatus(@RequestBody StatusEntity status){return new ResponseEntity<>(ruleService.getAllFoodProductRuleByStatus(status), HttpStatus.OK);}
}

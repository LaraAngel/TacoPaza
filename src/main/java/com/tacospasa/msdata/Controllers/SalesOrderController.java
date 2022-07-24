package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.SalesOrderEntity;
import com.tacospasa.msdata.Service.SalesOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/sales")
@Api(tags = "Sales Order")
public class SalesOrderController {
    @Autowired
    private SalesOrderService orderService;
    @ApiOperation(value = "get order by id", response = SalesOrderEntity.class)
    @GetMapping(value = "/order/{id}")
    public ResponseEntity<SalesOrderEntity> getSalesOrderById(@PathVariable Long id) {
        orderService.getSalesOrderById(id);
        return new ResponseEntity<>(HttpStatus.OK);}
    @ApiOperation(value = "get all order", response = SalesOrderEntity.class)
    @GetMapping(value = "/orders")
    public ResponseEntity<List<SalesOrderEntity>> getAllSalesOrder(){
        orderService.getAllSalesOrder();
        return new ResponseEntity<>(HttpStatus.OK);}
    @ApiOperation(value = "create order", response = SalesOrderEntity.class)
    @PostMapping(value = "/order}")
    public ResponseEntity<SalesOrderEntity> createSalesOrder(@RequestBody SalesOrderEntity salesOrder){
        orderService.createSalesOrder(salesOrder);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ApiOperation(value = "update order", response = SalesOrderEntity.class)
    @PutMapping(value = "/order")
    public ResponseEntity<SalesOrderEntity> updateSalesOrder(@RequestBody SalesOrderEntity salesOrder){
        orderService.updateSalesOrder(salesOrder);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ApiOperation(value = "get order by time", response = SalesOrderEntity.class)
    @GetMapping(value = "/order/time")
    public ResponseEntity<List<SalesOrderEntity>> getAllSalesOrderByTime(@RequestParam Time time) {
        orderService.getAllSalesOrderByTime(time);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ApiOperation(value = "get order by date", response = SalesOrderEntity.class)
    @GetMapping(value = "/order/date")
    public ResponseEntity<List<SalesOrderEntity>> getAllSalesOrderByDate(@RequestParam Date date){
        orderService.getAllSalesOrderByDate(date);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ApiOperation(value = "get order by status id", response = SalesOrderEntity.class)
    @GetMapping(value = "/order/status")
    public ResponseEntity<List<SalesOrderEntity>> getAllSalesOrderByStatusId(@RequestParam Long id){
        orderService.getAllSalesOrderByStatusId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ApiOperation(value = "get order by branch id", response = SalesOrderEntity.class)
    @GetMapping(value = "/order/branch")
    public ResponseEntity<List<SalesOrderEntity>> getAllSalesOrderByBranchId(@RequestParam Long id){
        orderService.getAllSalesOrderByBranchId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ApiOperation(value = "get order by user id", response = SalesOrderEntity.class)
    @GetMapping(value = "/order/responsible")
    public ResponseEntity<List<SalesOrderEntity>> getAllSalesOrderByResponsibleId(@RequestParam Long id){
        orderService.getAllSalesOrderByResponsibleId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

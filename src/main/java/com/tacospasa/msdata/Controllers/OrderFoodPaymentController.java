package com.tacospasa.msdata.Controllers;


import com.tacospasa.msdata.Entity.OrderPaymentEntity;
import com.tacospasa.msdata.Service.OrderPaymentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class OrderFoodPaymentController {
    @Autowired
    OrderPaymentService orderPaymentService;
    @ApiOperation(value = "get order food payment by id",response = OrderPaymentEntity.class)
    @GetMapping(value = "/order/payment/{id}")
    ResponseEntity<OrderPaymentEntity> getGetOrderFootPaymentById(@PathVariable Long id){
        return new ResponseEntity<>(orderPaymentService.getOrderPaymentById(id),HttpStatus.OK);
    }
    @ApiOperation(value = "get all order food payment",response = OrderPaymentEntity.class)
    @GetMapping(value = "/order/payments")
     ResponseEntity<List<OrderPaymentEntity>> getAllOrderFoodPaymentEntity(){
        return new ResponseEntity<>(orderPaymentService.getAllOrderPaymentEntity(),HttpStatus.OK);
    }
    @ApiOperation(value = "create order food payment",response = OrderPaymentEntity.class)
    @GetMapping(value = "/order/payment")
    ResponseEntity<OrderPaymentEntity> createOrderFoodPaymentEntity(@RequestBody OrderPaymentEntity orderFoodPayment){
        return new ResponseEntity<>(orderPaymentService.createOrderPaymentEntity(orderFoodPayment),HttpStatus.OK);
    }
    @ApiOperation(value = "update order food payment",response = OrderPaymentEntity.class)
    @GetMapping(value = "/order/payment")
    ResponseEntity<OrderPaymentEntity> updateOrderFoodPaymentEntity(@RequestBody OrderPaymentEntity orderFoodPayment){
        return new ResponseEntity<>(orderPaymentService.updateOrderPaymentEntity(orderFoodPayment),HttpStatus.OK);
    }
    @ApiOperation(value = "get order food payment by responsible id",response = OrderPaymentEntity.class)
    @GetMapping(value = "/order/payment/order")
    ResponseEntity<OrderPaymentEntity> getOrderFootPaymentById(@RequestParam Long id){
        return new ResponseEntity<>(orderPaymentService.getOrderPaymentByResponsibleId(id),HttpStatus.OK);

    }
    @ApiOperation(value = "get order food payment by SalesOrder id",response = OrderPaymentEntity.class)
    @GetMapping(value = "/order/payment/manager")
    ResponseEntity<OrderPaymentEntity> getOrderFoodPaymentById(@RequestParam Long id) {
        return new ResponseEntity<>(orderPaymentService.getOrderPaymentBySalesOrderId(id), HttpStatus.OK);
    }
}

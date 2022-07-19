package com.tacospasa.msdata.Controllers;


import com.tacospasa.msdata.Entity.OrderFoodPaymentEntity;
import com.tacospasa.msdata.Service.OrderFoodPaymentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class OrderFoodPaymentController {
    @Autowired
    OrderFoodPaymentService orderFoodPaymentService;

    @ApiOperation(value = "get all order food payment",response = OrderFoodPaymentEntity.class)
    @GetMapping(value = "/order/payments")
     ResponseEntity<List<OrderFoodPaymentEntity>> getAllOrderFoodPaymentEntity(){
        return new ResponseEntity<>(orderFoodPaymentService.getAllOrderFoodPaymentEntity(),HttpStatus.OK);
    }

    @ApiOperation(value = "get order food payment by id",response = OrderFoodPaymentEntity.class)
    @GetMapping(value = "/order/payment")
    ResponseEntity<OrderFoodPaymentEntity> getGetOrderFootPaymentById(@RequestParam Long id){
        return new ResponseEntity<>(orderFoodPaymentService.getGetOrderFootPaymentById(id),HttpStatus.OK);
    }

    @ApiOperation(value = "create order food payment",response = OrderFoodPaymentEntity.class)
    @GetMapping(value = "/order/payment")
    ResponseEntity<OrderFoodPaymentEntity> createOrderFoodPaymentEntity(@RequestBody OrderFoodPaymentEntity orderFoodPayment){
        return new ResponseEntity<>(orderFoodPaymentService.createOrderFoodPaymentEntity(orderFoodPayment),HttpStatus.OK);
    }

    @ApiOperation(value = "update order food payment",response = OrderFoodPaymentEntity.class)
    @GetMapping(value = "/order/payment")
    ResponseEntity<OrderFoodPaymentEntity> updateOrderFoodPaymentEntity(@RequestBody OrderFoodPaymentEntity orderFoodPayment){
        return new ResponseEntity<>(orderFoodPaymentService.updateOrderFoodPaymentEntity(orderFoodPayment),HttpStatus.OK);
    }

    @ApiOperation(value = "update order food payment",response = OrderFoodPaymentEntity.class)
    @GetMapping(value = "/order/payment/order")
    ResponseEntity<OrderFoodPaymentEntity> getOrderFootPaymentById(@RequestParam Long id){
        return new ResponseEntity<>(orderFoodPaymentService.getOrderFootPaymentById(id),HttpStatus.OK);

    }

    @ApiOperation(value = "update order food payment",response = OrderFoodPaymentEntity.class)
    @GetMapping(value = "/order/payment/manager")
    ResponseEntity<OrderFoodPaymentEntity> getOrderFoodPaymentById(@RequestParam Long id) {
        return new ResponseEntity<>(orderFoodPaymentService.getOrderFoodPaymentById(id), HttpStatus.OK);
    }
}

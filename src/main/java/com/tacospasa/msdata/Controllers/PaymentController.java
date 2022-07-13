package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.FoodCategoryEntity;
import com.tacospasa.msdata.Entity.PaymentEntity;
import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/payments")
@Api(tags = "Payment")

public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @ApiOperation(value = "get payment by id",response = PaymentEntity.class)
    @GetMapping(value = "/payment/{id}")
    ResponseEntity<PaymentEntity> getPaymentById(@PathVariable Long id){
        return new ResponseEntity<>(paymentService.getPaymentById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "get All Payment",response = PaymentEntity.class)
    @GetMapping(value = "/payments")
    ResponseEntity<List<PaymentEntity>> getAllPayment (){
        return new ResponseEntity<>(paymentService.getAllPayment(),HttpStatus.OK);
    }

    @ApiOperation(value = "get payment method",response = PaymentEntity.class)
    @GetMapping(value = "/payments/method")
    ResponseEntity<List<PaymentEntity>> getPaymentByPaymentMethod(@RequestBody PaymentMethodEntity paymentMethod){
        return new ResponseEntity<>(paymentService.getPaymentByPaymentMethod(paymentMethod),HttpStatus.OK);
    }

    @ApiOperation(value = "get payment by date",response = PaymentEntity.class)
    @GetMapping(value = "/payments/date")
    ResponseEntity<List<PaymentEntity>> getPaymentByDate(@RequestParam Date date){
        return new ResponseEntity<>(paymentService.getPaymentByDate(date),HttpStatus.OK);
    }

    @ApiOperation(value = "get payment by status",response = PaymentEntity.class)
    @GetMapping(value = "/payments/status")
    ResponseEntity<List<PaymentEntity>> getPaymentByStatus(@RequestParam StatusEntity status)
    {
        return new ResponseEntity<>(paymentService.getPaymentByStatus(status),HttpStatus.OK);

    }

    @ApiOperation(value = "create payment",response = PaymentEntity.class)
    @GetMapping(value = "/payment")
    ResponseEntity<PaymentEntity> createPayment(PaymentEntity payment){
        return new ResponseEntity<>(paymentService.createPayment(payment),HttpStatus.OK);
    }

    @ApiOperation(value = "update payment",response = PaymentEntity.class)
    @GetMapping(value = "/payment")
    ResponseEntity<PaymentEntity> updatePayment(PaymentEntity payment){
        return new ResponseEntity<>(paymentService.updatePayment(payment),HttpStatus.OK);
    }
}

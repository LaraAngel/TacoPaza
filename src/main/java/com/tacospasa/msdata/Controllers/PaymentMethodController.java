package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Service.PaymentMethodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/payments")
@Api(tags = "Payment Method")
public class PaymentMethodController {
    @Autowired
    private PaymentMethodService paymentMethodService;

    @ApiOperation(value = "getById Payment Methods",response = PaymentMethodEntity.class,tags = "Payment Method")
    @GetMapping(value = "/method/{id}")
    public PaymentMethodEntity getPaymentMethodById(@PathVariable Long id){
        return paymentMethodService.getPaymentMethodById(id);
    }
    @ApiOperation(value = "get All Payment Methods",response = PaymentMethodEntity.class,tags = "Payment Method")
    @GetMapping(value = "/methods")
    public List<PaymentMethodEntity> getAllPaymentMethod(){
        return paymentMethodService.getAllPaymentMethod();
    }
    @ApiOperation(value = "Update Payment Method ", response= UserEntity.class, tags = "Payment Method")
    @PutMapping(value = "/method")
    public PaymentMethodEntity updatePaymentMethod(@RequestBody PaymentMethodEntity paymentMethod){
        return paymentMethodService.UpdatePaymentMethod(paymentMethod);
    }
    @ApiOperation(value = "Create Payment Method Entity", response= PaymentMethodEntity.class, tags = "Payment Method")
    @PostMapping(value = "/method")
    public PaymentMethodEntity createPaymentMethod(@RequestBody PaymentMethodEntity paymentMethod){
        return paymentMethodService.CreatePaymentMethod(paymentMethod);
    }

}

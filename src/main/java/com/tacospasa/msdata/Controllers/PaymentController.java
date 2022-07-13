package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.PaymentEntity;
import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.PaymentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/payments")
@Api(tags = "Payment")

public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    PaymentEntity getPaymentById(Long id){
        return null;
    }
    List<PaymentEntity> getAllPayment(){return null;}
    List<PaymentEntity> getPaymentByPaymentMethod(PaymentMethodEntity paymentMethod){return null;}
    List<PaymentEntity> getPaymentByDate(Date date){return null;}
    List<PaymentEntity> getPaymentByStatus(StatusEntity status){
        return null;
    }
    PaymentEntity createPayment(PaymentEntity payment){
        return null;
    }
    PaymentEntity updatePayment(PaymentEntity payment){
        return null;
    }
}

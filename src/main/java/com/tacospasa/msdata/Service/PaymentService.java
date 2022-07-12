package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.PaymentEntity;
import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;

import java.util.Date;
import java.util.List;

public interface PaymentService {
    PaymentEntity getPaymentById(Long id);
    List<PaymentEntity> getAllPayment();
    List<PaymentEntity> getPaymentByPaymentMethod(PaymentMethodEntity paymentMethod);
    List<PaymentEntity> getPaymentByDate(Date date);
    List<PaymentEntity> getPaymentByStatus(StatusEntity status);
    PaymentEntity createPayment(PaymentEntity payment);
    PaymentEntity updatePayment(PaymentEntity payment);
}

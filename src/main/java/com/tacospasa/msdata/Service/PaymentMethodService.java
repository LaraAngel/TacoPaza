package com.tacospasa.msdata.Service;


import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.StatusEntity;

import java.util.List;

public interface PaymentMethodService {
    List<PaymentMethodEntity> getAllPaymentMethod();
    PaymentMethodEntity getPaymentMethodById(Long id);
    PaymentMethodEntity UpdatePaymentMethod(PaymentMethodEntity paymentMethod);
    PaymentMethodEntity CreatePaymentMethod(PaymentMethodEntity paymentMethod);
}

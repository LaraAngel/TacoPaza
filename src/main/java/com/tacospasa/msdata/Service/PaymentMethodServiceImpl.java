package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PaymentMethodServiceImpl implements PaymentMethodService{
    @Autowired
    private PaymentMethodRepository repository;
    @Override
    public List<PaymentMethodEntity> getAllPaymentMethod() {
        return repository.findAll();
    }

    @Override
    public PaymentMethodEntity getPaymentMethodById(Long id) {
        return repository.getReferenceById(Math.toIntExact(id));
    }

    @Override
    public PaymentMethodEntity UpdatePaymentMethod(PaymentMethodEntity paymentMethod) {
        String id = String.valueOf(paymentMethod.getId());

        if (getPaymentMethodById(Long.valueOf(id)) != null) {
            return repository.saveAndFlush(paymentMethod);
        }
        return new PaymentMethodEntity();
    }

    @Override
    public PaymentMethodEntity CreatePaymentMethod(PaymentMethodEntity paymentMethod) {
        return repository.saveAndFlush(paymentMethod);
    }
}

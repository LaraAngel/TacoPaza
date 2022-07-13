package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.PaymentEntity;
import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repository;

    @Override
    public PaymentEntity getPaymentById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<PaymentEntity> getAllPayment() {
        return repository.findAll();
    }

    @Override
    public List<PaymentEntity> getPaymentByPaymentMethod(PaymentMethodEntity paymentMethod) {
        return repository.getPaymentByPaymentMethod(paymentMethod);
    }

    @Override
    public List<PaymentEntity> getPaymentByDate(Date date) {
        return repository.getPaymentByDate(date);
    }

    @Override
    public List<PaymentEntity> getPaymentByStatus(StatusEntity status) {
        return repository.getPaymentByStatus(status);
    }

    @Override
    public PaymentEntity createPayment(PaymentEntity payment) {
        return repository.saveAndFlush(payment);
    }

    @Override
    public PaymentEntity updatePayment(PaymentEntity payment) {
        return repository.saveAndFlush(payment);
    }
}

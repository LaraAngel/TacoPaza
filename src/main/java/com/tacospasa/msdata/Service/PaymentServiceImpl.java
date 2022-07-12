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
        return null;
    }

    @Override
    public List<PaymentEntity> getAllPayment() {
        return null;
    }

    @Override
    public List<PaymentEntity> getPaymentByPaymentMethod(PaymentMethodEntity paymentMethod) {
        return null;
    }

    @Override
    public List<PaymentEntity> getPaymentByDate(Date date) {
        return null;
    }

    @Override
    public List<PaymentEntity> getPaymentByStatus(StatusEntity status) {
        return null;
    }

    @Override
    public PaymentEntity createPayment(PaymentEntity payment) {
        return null;
    }

    @Override
    public PaymentEntity updatePayment(PaymentEntity payment) {
        return null;
    }
}

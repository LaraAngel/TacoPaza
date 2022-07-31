package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.OrderPaymentEntity;
import com.tacospasa.msdata.Repository.OrderPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPaymentServiceImpl implements OrderPaymentService {
    @Autowired
    private OrderPaymentRepository repository;

    @Override
    public OrderPaymentEntity getOrderPaymentById(Long id) {return repository.findById(id).get();}

    @Override
    public List<OrderPaymentEntity> getAllOrderPaymentEntity() {return repository.findAll();}

    @Override
    public OrderPaymentEntity createOrderPaymentEntity(OrderPaymentEntity orderPaymentEntity) {return repository.saveAndFlush(orderPaymentEntity); }

    @Override
    public OrderPaymentEntity updateOrderPaymentEntity(OrderPaymentEntity orderPaymentEntity) {return repository.saveAndFlush(orderPaymentEntity);}

    @Override
    public OrderPaymentEntity getOrderPaymentByResponsibleId(Long id) {return repository.getOrderPaymentByResponsibleId(id); }

    @Override
    public OrderPaymentEntity getOrderPaymentBySalesOrderId(Long id) {return repository.getOrderPaymentBySalesOrderId(id); }
}

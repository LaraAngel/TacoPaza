package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.OrderFoodPaymentEntity;
import com.tacospasa.msdata.Repository.OrderFoodPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderFoodPaymentServiceImpl implements OrderFoodPaymentService{
    @Autowired
    private OrderFoodPaymentRepository repository;

    @Override
    public List<OrderFoodPaymentEntity> getAllOrderFoodPaymentEntity(){
        return repository.findAll();
    }
    @Override
    public OrderFoodPaymentEntity getGetOrderFootPaymentById(Long id){
        return repository.getReferenceById(id);
    }
    @Override
    public OrderFoodPaymentEntity createOrderFoodPaymentEntity(OrderFoodPaymentEntity orderFoodPayment){
        return repository.saveAndFlush(orderFoodPayment);
    }
    @Override
    public OrderFoodPaymentEntity updateOrderFoodPaymentEntity(OrderFoodPaymentEntity orderFoodPayment){
        return repository.saveAndFlush(orderFoodPayment);
    }
    @Override
    public OrderFoodPaymentEntity getOrderFootPaymentById(Long id){
        return repository.getOrderFootPaymentById(id);

    }
    @Override
    public OrderFoodPaymentEntity getOrderFoodPaymentById(Long id){
        return repository.getOrderFoodPaymentById(id);
    }
}

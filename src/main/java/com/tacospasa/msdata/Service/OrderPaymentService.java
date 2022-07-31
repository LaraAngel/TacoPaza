package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.OrderPaymentEntity;

import java.util.List;

public interface OrderPaymentService {
    OrderPaymentEntity getOrderPaymentById(Long id);
    List<OrderPaymentEntity> getAllOrderPaymentEntity();
    OrderPaymentEntity createOrderPaymentEntity(OrderPaymentEntity orderPaymentEntity);
    OrderPaymentEntity updateOrderPaymentEntity(OrderPaymentEntity orderPaymentEntity);
    OrderPaymentEntity getOrderPaymentByResponsibleId(Long id);
    OrderPaymentEntity getOrderPaymentBySalesOrderId(Long id);
}

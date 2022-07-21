package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.FoodProductOrderEntity;
import com.tacospasa.msdata.Entity.OrderFoodPaymentEntity;
import com.tacospasa.msdata.Entity.PaymentEntity;
import com.tacospasa.msdata.Entity.UserEntity;

import java.util.List;
import java.util.function.LongFunction;

public interface OrderFoodPaymentService {
    List<OrderFoodPaymentEntity> getAllOrderFoodPaymentEntity();
    OrderFoodPaymentEntity getGetOrderFootPaymentById(Long id);
    OrderFoodPaymentEntity createOrderFoodPaymentEntity(OrderFoodPaymentEntity orderFoodPayment);
    OrderFoodPaymentEntity updateOrderFoodPaymentEntity(OrderFoodPaymentEntity orderFoodPayment);
    OrderFoodPaymentEntity getOrderFootPaymentById(Long id);
    OrderFoodPaymentEntity getOrderFoodPaymentById(Long id);
}

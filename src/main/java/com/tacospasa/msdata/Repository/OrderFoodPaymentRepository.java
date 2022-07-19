package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.OrderFoodPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderFoodPaymentRepository extends JpaRepository<OrderFoodPaymentEntity,Long> {
    @Query("select order from OrderFoodPaymentEntity order where order.salesOrder.id = :id")
    OrderFoodPaymentEntity getOrderFootPaymentById(@Param("id") Long id);
    @Query("select order from OrderFoodPaymentEntity order where order.responsable.id = :id")
    OrderFoodPaymentEntity getOrderFoodPaymentById(@Param("id") Long id);
}

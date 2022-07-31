package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.OrderPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderPaymentRepository extends JpaRepository<OrderPaymentEntity,Long> {
    @Query("select order from OrderPaymentEntity order where order.salesOrder.id = :id")
    OrderPaymentEntity getOrderPaymentBySalesOrderId(@Param("id") Long id);
    @Query("select order from OrderPaymentEntity order where order.responsible.id = :id")
    OrderPaymentEntity getOrderPaymentByResponsibleId(@Param("id") Long id);
}

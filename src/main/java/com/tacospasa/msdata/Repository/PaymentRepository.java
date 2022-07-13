package com.tacospasa.msdata.Repository;


import com.tacospasa.msdata.Entity.PaymentEntity;
import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


public interface PaymentRepository extends JpaRepository<PaymentEntity,Long> {
    @Query("select pay from PaymentEntity pay where pay.paymentMethodEntity = :paymentMethod")
    List<PaymentEntity> getPaymentByPaymentMethod(@Param("paymentMethod") PaymentMethodEntity paymentMethod);
    @Query("select pay from PaymentEntity pay where pay.date = :date")
    List<PaymentEntity> getPaymentByDate(@Param("date") Date date);
    @Query("select pay from PaymentEntity pay where pay.status = :status")
    List<PaymentEntity> getPaymentByStatus(@Param("status") StatusEntity status);
}
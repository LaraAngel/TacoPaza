package com.tacospasa.msdata.Repository;


import com.tacospasa.msdata.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<PaymentEntity,Long> {
}
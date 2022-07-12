package com.tacospasa.msdata.Repository;


import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentMethodRepository extends JpaRepository<PaymentMethodEntity,Long> {
}

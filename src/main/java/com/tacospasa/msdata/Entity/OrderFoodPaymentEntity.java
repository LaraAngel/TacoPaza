package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Order_Food_Payment")
@Data

public class OrderFoodPaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}

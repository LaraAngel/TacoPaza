package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment")
@Data

public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @OneToOne
    private PaymentMethodEntity paymentMethodEntity;
    private float paid;
    private float remainder;
    private float total;
    @OneToOne
    private StatusEntity status;

}

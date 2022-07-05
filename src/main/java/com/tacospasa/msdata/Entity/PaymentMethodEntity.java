package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "paymentmethod")
@Data
@Embeddable

public class PaymentMethodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentMethodName;
    private String paymentMethodDescription;
    @OneToOne
    private StatusEntity status;

}

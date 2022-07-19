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
    @OneToOne
    private FoodProductOrderEntity salesOrder;
    @OneToOne
    private PaymentEntity payments;
    @OneToOne
    private StatusEntity status;
    private Float subTotal;
    private Float discount;
    private Float total;
    private Float remainder;
    @OneToOne
    private UserEntity responsable;

}

package com.tacospasa.msdata.Entity;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cash_balance")
@Data

public class CashBalanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @OneToOne
    private UserEntity manager;
    @OneToOne
    private PaymentEntity paymentEntity;
    private float total;
    private float inCashRegister;
    private float difference;
    private float expenses;
    @OneToOne
    private StatusEntity statusEntity;
    @OneToOne
    private BranchEntity branchEntity;

}

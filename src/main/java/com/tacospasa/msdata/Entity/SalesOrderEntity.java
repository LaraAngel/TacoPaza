package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sales_order")
@Data
public class SalesOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long folio;
    @OneToOne
    private UserEntity responsible;
    private Date date;
    private Time time;
    @OneToOne
    private BranchEntity branch;
    @OneToOne
    private StatusEntity status;
    @OneToMany
    private List<FoodProductOrderEntity> products;
    private Float discount;
    private Float subtotal;
    private Float total;
}

package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "food_product_order")
public class FoodProductOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private FoodProductEntity foodProduct;
    private String comments;
    private Boolean isPrinted;
    private Integer quantity;
    @OneToOne
    private StatusEntity status;
}

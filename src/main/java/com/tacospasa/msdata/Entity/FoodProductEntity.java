package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "food_product")
@Data
public class FoodProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foodProductName;
    @ElementCollection
    private List<FoodProductRuleEntity> foodProductRules;
    private Float price;
    @OneToOne
    private StatusEntity status;
    @OneToOne
    private FoodCategoryEntity foodCategory;
}
package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "food_product_rule")
@Data
@Embeddable
public class FoodProductRuleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foodProductRuleName;
    private String foodProductRuleDescription;
    @OneToOne
    private StatusEntity status;
}

package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "food_category")
@Data
public class FoodCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foodCategoryName;
    @OneToOne
    private StatusEntity status;
}

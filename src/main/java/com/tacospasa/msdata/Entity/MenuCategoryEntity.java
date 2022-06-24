package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu_category")
@Data
public class MenuCategoryEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    @OneToOne
    private StatusEntity status;
    @ElementCollection
    private List<SubCategoryEntity> subCategories;

}

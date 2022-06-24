package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "menu_category")
@Data
public class MenuCategoryEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String categoryName;

    @ElementCollection
    private List<SubCategoryEntity> subCategories;

<<<<<<< Updated upstream

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
=======
    @OneToOne
    private StatusEntity status;
>>>>>>> Stashed changes
}

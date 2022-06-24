package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "sub_category")
@Data
@Embeddable
public class SubCategoryEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String subCategoryName;
    private String pageName;
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

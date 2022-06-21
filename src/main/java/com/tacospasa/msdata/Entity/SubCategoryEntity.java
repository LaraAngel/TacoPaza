package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "sub_category")
@Data
@Embeddable
public class SubCategoryEntity {
    private Long id;
    private String subCategoryName;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

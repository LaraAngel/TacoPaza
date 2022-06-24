package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sub_category")
@Data
@Embeddable
public class SubCategoryEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String subCategoryName;
    private String pageName;

}

package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String productDescription;
    @OneToOne
    private PresentationEntity presentation;
    @OneToOne
    private DepartmentEntity department;
    @OneToOne
    private StatusEntity status;
}

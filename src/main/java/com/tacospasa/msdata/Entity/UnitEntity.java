package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "unitmeasures")
@Data
public class UnitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String unitMeasureName;
    private String unitMeasureDescription;
    @OneToOne
    private StatusEntity status;
}

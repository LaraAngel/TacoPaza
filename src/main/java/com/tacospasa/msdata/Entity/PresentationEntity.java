package com.tacospasa.msdata.Entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "presentation")
public class PresentationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String presentationName;
    private String presentationDescription;

    @OneToOne
    private StatusEntity status;

    @OneToOne
    private UnitEntity unitMeasure;
}
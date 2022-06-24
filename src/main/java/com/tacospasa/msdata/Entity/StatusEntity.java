package com.tacospasa.msdata.Entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "status")
@Data
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statusName;
    private String statusDescripction;
}

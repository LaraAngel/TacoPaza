package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "access")
@Data
@Embeddable
public class AccessEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private  String accessName;
    private String status;

}

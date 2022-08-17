package com.tacospasa.msdata.Entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Table(name = "access")
@Data
public class AccessEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private  String access_name;
    @OneToOne
    private StatusEntity status;
}

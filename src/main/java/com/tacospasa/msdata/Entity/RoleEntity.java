package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
@Data
@Embeddable
public class RoleEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private  String roleName;
    private String status;
    @ElementCollection
    private List<AccessEntity> access;
}

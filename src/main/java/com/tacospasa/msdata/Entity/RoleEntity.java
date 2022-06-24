package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "role")
@Data
public class RoleEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private  String role_name;
    private String status;
    @ElementCollection
    private List<AccessEntity> access;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

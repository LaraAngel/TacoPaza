package com.tacospasa.msdata.Entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String userName;
    private String password;
    @OneToOne
    private StatusEntity status;

    @ElementCollection
    private List<RoleEntity> roleEntityList;
}

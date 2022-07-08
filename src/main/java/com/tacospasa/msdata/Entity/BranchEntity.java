package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "branch")
@Data
public class BranchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String branchName;
    @OneToOne
    private UserEntity manager;
    private String location;
    @OneToOne
    private StatusEntity status;
}

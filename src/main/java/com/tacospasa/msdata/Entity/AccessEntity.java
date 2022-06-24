package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "access")
@Data
@Embeddable
public class AccessEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
<<<<<<< Updated upstream
    private  String access_name;
    private String status;
=======
    private  String accessName;
    @OneToOne
    private StatusEntity status;
>>>>>>> Stashed changes

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

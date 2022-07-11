package com.tacospasa.msdata.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "provider")
@Data
public class ProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

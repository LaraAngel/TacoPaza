package com.tacospasa.msdata.Entity;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "inventory_product")
public class InventoryProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String inventoryProductName;
    @OneToOne
    private ProductEntity product;
    private Long quantity;
    @OneToOne
    private PresentationEntity presentation;
    @OneToOne
    private WarehouseEntity warehouse;
    @OneToOne
    private BranchEntity branch;
    private Date expirationDate;
    private Date inputDate;
    @OneToOne
    private ProviderEntity provider;
    @OneToOne
    private StatusEntity status;
}

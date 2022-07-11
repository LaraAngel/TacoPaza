package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}

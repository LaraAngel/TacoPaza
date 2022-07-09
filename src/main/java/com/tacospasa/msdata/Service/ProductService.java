package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.ProductEntity;

import java.util.List;

public interface ProductService {
    ProductEntity getProductById(Long id);
    List<ProductEntity> getAllProducts();
    ProductEntity createProduct(ProductEntity product);
    ProductEntity updateProduct(ProductEntity product);
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.ProductEntity;
import com.tacospasa.msdata.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository repository;
    @Override
    public ProductEntity getProductById(Long id) { return repository.getReferenceById(id);}
    @Override
    public List<ProductEntity> getAllProducts() {return repository.findAll();}
    @Override
    public ProductEntity createProduct(ProductEntity product) {return repository.saveAndFlush(product);}
    @Override
    public ProductEntity updateProduct(ProductEntity product) {
        Long id = product.getId();

        if (getProductById((id)) != null) {
            return repository.saveAndFlush(product);
        }
        return new ProductEntity();
    }
}
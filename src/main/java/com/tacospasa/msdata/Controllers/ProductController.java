package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.ProductEntity;
import com.tacospasa.msdata.Service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inventory")
@Api(tags = "product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ApiOperation(value = "get product by id", response = ProductEntity.class, tags = "product")
    @GetMapping(value = "/product/{id}")
    public ProductEntity getProductById(@PathVariable Long id){return productService.getProductById(id);}
    @ApiOperation(value = "Get all products", response = ProductEntity.class, tags = "product")
    @GetMapping(value = "/products")
    public List<ProductEntity> getAllProducts(){return productService.getAllProducts();}
    @ApiOperation(value = "Create new Product", response = ProductEntity.class, tags = "product")
    @PostMapping(value = "/product")
    public ProductEntity createProduct(@RequestBody ProductEntity product){return productService.createProduct(product);}
    @ApiOperation(value = "Update product", response = ProductEntity.class, tags = "product")
    @PutMapping(value = "/product")
    public ProductEntity updateProduct(@RequestBody ProductEntity product){return productService.updateProduct(product);}
}

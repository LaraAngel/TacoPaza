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
@Api(tags = "Product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ApiOperation(value = "get product by id", response = ProductEntity.class, tags = "Product")
    @GetMapping(value = "/product/{id}")
    public ProductEntity getProductById(@PathVariable Long id){return productService.getProductById(id);}
    @ApiOperation(value = "Get all products", response = ProductEntity.class, tags = "Product")
    @GetMapping(value = "/products")
    public List<ProductEntity> getAllProducts(){return productService.getAllProducts();}
    @ApiOperation(value = "Create new Product", response = ProductEntity.class, tags = "Product")
    @PostMapping(value = "/product")
    public ProductEntity createProduct(@RequestBody ProductEntity product){return productService.createProduct(product);}
    @ApiOperation(value = "Update product", response = ProductEntity.class, tags = "Product")
    @PutMapping(value = "/product")
    public ProductEntity updateProduct(@RequestBody ProductEntity product){return productService.updateProduct(product);}
}

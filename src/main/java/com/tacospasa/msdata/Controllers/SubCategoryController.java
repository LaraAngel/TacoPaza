package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;
import com.tacospasa.msdata.Service.MenuCategoryService;
import com.tacospasa.msdata.Service.SubCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/system/menu")
@Api(tags = "Subcategory")
public class SubCategoryController {

    @Autowired
    private SubCategoryService service;

    @ApiOperation(value = "Create new subCategory", response = SubCategoryEntity.class, tags = "Subcategory")
    @PostMapping(value = "/subcategory")
    public SubCategoryEntity createSubCategory(@RequestBody SubCategoryEntity subCategory){
        return service.createSubCategory(subCategory);
    }

    @ApiOperation(value = "Create new subCategory", response = SubCategoryEntity.class, tags = "Subcategory")
    @PostMapping(value = "/subcategories")
    public SubCategoryEntity createMultipleSubCategories(@RequestBody List<SubCategoryEntity> subCategory){
        return service.createMultipleSubCategories(subCategory);
    }

    @ApiOperation(value = "Get all subCategories", response = SubCategoryEntity.class, tags = "Subcategory")
    @GetMapping(value = "/subcategories")
    public List<SubCategoryEntity> getAllSubCategories(){
        return service.getAllSubCategories();
    }

    @ApiOperation(value = "Get subCategory by ID", response = SubCategoryEntity.class, tags = "Subcategory")
    @GetMapping(value = "/subcategory/{id}")
    public SubCategoryEntity getSubCategoryById(@PathVariable Long id){
        return service.getSubCategoryById(id);
    }
}

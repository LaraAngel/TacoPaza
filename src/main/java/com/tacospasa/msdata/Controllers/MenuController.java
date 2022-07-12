package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;
import com.tacospasa.msdata.Service.MenuCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/system/menu")
@Api(tags = "Menu")
public class MenuController {

    @Autowired
    private MenuCategoryService service;

    @ApiOperation(value = "Get category by id", response = MenuCategoryEntity.class, tags = "Menu")
    @GetMapping(value = "/category/{id}")
    public MenuCategoryEntity getMenuCategoryById(@PathVariable Long id) {
        return service.getMenuCategoryById(id);
    }

    @ApiOperation(value = "Get all the menu categories", response = MenuCategoryEntity.class, tags = "Menu")
    @GetMapping(value = "/categories")
    public List<MenuCategoryEntity> getAllMenuCategories() {
        return service.getAllMenuCategories();
    }

    @ApiOperation(value = "Create new Category", response = MenuCategoryEntity.class, tags = "Menu")
    @PostMapping(value = "/category")
    public MenuCategoryEntity createNewMenuCategory(@RequestBody MenuCategoryEntity menuCategory) {
        return service.createNewMenuCategory(menuCategory);
    }

    @ApiOperation(value = "Add new SubCategories", response = MenuCategoryEntity.class, tags = "Menu")
    @PutMapping(value = "/category/subcategories")
    public MenuCategoryEntity addSubCategories(@RequestBody List<SubCategoryEntity> subCategories, @RequestParam Long id) {
        return service.addSubCategories(subCategories, id);
    }
    @ApiOperation(value = "Add new SubCategory", response = MenuCategoryEntity.class, tags = "Menu")
    @PutMapping(value = "/category/subcategory")
    public MenuCategoryEntity addSubCategory(@RequestBody SubCategoryEntity subCategory,@RequestParam Long id) {
        return service.addSubCategory(subCategory, id);
    }
}

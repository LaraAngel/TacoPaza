package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Service.MenuCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/system/menu")
public class MenuController {

    @Autowired
    private MenuCategoryService service;

    @ApiOperation(value = "Get category by id", response = MenuCategoryEntity.class)
    @GetMapping(value = "/category")
    public MenuCategoryEntity getMenuCategoryById(@RequestParam Integer id) {
        return service.getMenuCategoryById(id);
    }

    @ApiOperation(value = "Get all the menu categories", response = MenuCategoryEntity.class)
    @GetMapping(value = "/categories")
    public List<MenuCategoryEntity> getAllMenuCategories() {
        return service.getAllMenuCategories();
    }

    @ApiOperation(value = "Create new Category", response = MenuCategoryEntity.class)
    @PostMapping(value = "/category")
    public MenuCategoryEntity createNewMenuCategory(@RequestBody MenuCategoryEntity menuCategory) {
        return service.createNewMenuCategory(menuCategory);
    }

    @ApiOperation(value = "Add new SubCategories", response = MenuCategoryEntity.class)
    @PutMapping(value = "/category/subcategories")
    public MenuCategoryEntity addSubCategories(@RequestBody List<SubCategoryEntity> subCategories, @RequestParam Integer id) {
        return service.addSubCategories(subCategories, id);
    }
    @ApiOperation(value = "Add new SubCategory", response = MenuCategoryEntity.class)
    @PutMapping(value = "/category/subcategory")
    public MenuCategoryEntity addSubCategory(@RequestBody SubCategoryEntity subCategory,@RequestParam Integer id) {
        return service.addSubCategory(subCategory, id);
    }
}

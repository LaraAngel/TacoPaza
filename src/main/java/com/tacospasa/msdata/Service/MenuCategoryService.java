package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;

import java.util.List;

public interface MenuCategoryService {
    MenuCategoryEntity getMenuCategoryById(Long id);
    List<MenuCategoryEntity> getAllMenuCategories();
    MenuCategoryEntity createNewMenuCategory(MenuCategoryEntity menuCategory);
    MenuCategoryEntity addSubCategories(List<SubCategoryEntity> subCategories, Long id);
    MenuCategoryEntity addSubCategory(SubCategoryEntity subCategory, Long id);
    MenuCategoryEntity updateMenuCategory(MenuCategoryEntity category);
}
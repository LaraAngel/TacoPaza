package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;

import java.util.List;

public interface MenuCategoryService {
    MenuCategoryEntity getMenuCategoryById(int id);
    List<MenuCategoryEntity> getAllMenuCategories();
    MenuCategoryEntity createNewMenuCategory(MenuCategoryEntity menuCategory);
    MenuCategoryEntity addSubCategories(List<SubCategoryEntity> subCategories, int id);
    MenuCategoryEntity addSubCategory(SubCategoryEntity subCategory, int id);

}
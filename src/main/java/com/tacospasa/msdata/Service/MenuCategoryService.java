package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;

import java.util.List;

public interface MenuCategoryService {
    public MenuCategoryEntity getMenuCategoryById(int id);
    public List<MenuCategoryEntity> getAllMenuCategories();
    public MenuCategoryEntity createNewMenuCategory(MenuCategoryEntity menuCategory);
    MenuCategoryEntity addSubCategories(List<SubCategoryEntity> subCategories, int id);
    MenuCategoryEntity addSubCategory(SubCategoryEntity subCategory, int id);

}
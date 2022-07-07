package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;
import com.tacospasa.msdata.Repository.MenuCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuCategoryServiceImpl implements MenuCategoryService {

    @Autowired
    private MenuCategoryRepository repository;
    @Override
    public MenuCategoryEntity getMenuCategoryById(int id) {
        return repository.getReferenceById(id);
    }
    @Override
    public List<MenuCategoryEntity> getAllMenuCategories() {
        return repository.findAll();
    }
    @Override
    public MenuCategoryEntity createNewMenuCategory(MenuCategoryEntity menuCategory) {
        return repository.saveAndFlush(menuCategory);
    }
    @Override
    public MenuCategoryEntity addSubCategories(List<SubCategoryEntity> subCategories, int id) {
        MenuCategoryEntity menu = getMenuCategoryById(id);
        List<SubCategoryEntity> subCategoriesFromDB = menu.getSubCategories();
        subCategoriesFromDB.addAll(subCategories);
        menu.setSubCategories(subCategoriesFromDB);
        return repository.saveAndFlush(menu);
    }
    @Override
    public MenuCategoryEntity addSubCategory(SubCategoryEntity subCategory, int id) {
        MenuCategoryEntity menu = getMenuCategoryById(id);
        List<SubCategoryEntity> subCategoriesFromDB = menu.getSubCategories();
        subCategoriesFromDB.add(subCategory);
        menu.setSubCategories(subCategoriesFromDB);
        return repository.saveAndFlush(menu);
    }
}

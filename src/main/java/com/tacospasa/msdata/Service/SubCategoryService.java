package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.SubCategoryEntity;

import java.util.List;

public interface SubCategoryService {
    public SubCategoryEntity createSubCategory(SubCategoryEntity subCategory);
    public SubCategoryEntity createMultipleSubCategories(List<SubCategoryEntity> subCategory);

    public List<SubCategoryEntity> getAllSubCategories();

    SubCategoryEntity getSubCategoryById(int id);
}

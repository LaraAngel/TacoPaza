package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.SubCategoryEntity;

import java.util.List;

public interface SubCategoryService {
     SubCategoryEntity createSubCategory(SubCategoryEntity subCategory);
     SubCategoryEntity createMultipleSubCategories(List<SubCategoryEntity> subCategory);
     List<SubCategoryEntity> getAllSubCategories();
     SubCategoryEntity getSubCategoryById(Long id);
}

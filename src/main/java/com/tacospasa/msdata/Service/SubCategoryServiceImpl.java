package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.SubCategoryEntity;
import com.tacospasa.msdata.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryRepository repository;

    @Override
    public SubCategoryEntity createSubCategory(SubCategoryEntity subCategory) {
        return repository.saveAndFlush(subCategory);
    }

    @Override
    public SubCategoryEntity createMultipleSubCategories(List<SubCategoryEntity> subCategories) {
        subCategories.stream().forEach(subCategory -> repository.saveAllAndFlush(subCategory));
        return new SubCategoryEntity();
    }

    @Override
    public List<SubCategoryEntity> getAllSubCategories() {
        return repository.findAll();
    }

    @Override
    public SubCategoryEntity getSubCategoryById(int id) {
        return repository.getReferenceById(id);
    }
}

package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.SubCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SubCategoryRepository  extends JpaRepository<SubCategoryEntity, Integer> {
}

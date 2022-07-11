package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuCategoryRepository extends JpaRepository<MenuCategoryEntity, Long> {
}

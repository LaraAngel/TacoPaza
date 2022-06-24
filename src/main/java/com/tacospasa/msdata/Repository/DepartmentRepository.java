package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Integer> {
    DepartmentEntity deleteById(long id);

    DepartmentEntity findById(Long id);
}

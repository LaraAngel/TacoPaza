package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    @Query("select dp from DepartmentEntity dp where dp.id =:id")
    DepartmentEntity getDepartmentById(@Param("id") Long id);
}

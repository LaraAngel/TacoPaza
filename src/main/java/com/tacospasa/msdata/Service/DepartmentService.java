package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.DepartmentEntity;

import java.util.List;

public interface DepartmentService {
    DepartmentEntity deleteDepartmentById(long id);
    DepartmentEntity createDepartment(DepartmentEntity department);
    List<DepartmentEntity> getAllDepartments();
    DepartmentEntity getDepartmentById(Long id);
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.DepartmentEntity;
import com.tacospasa.msdata.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository repository;
    @Override
    public DepartmentEntity createDepartment(DepartmentEntity department) {return repository.saveAndFlush(department);}
    @Override
    public List<DepartmentEntity> getAllDepartments() {return repository.findAll();}
    @Override
    public DepartmentEntity getDepartmentById(Long id) {return repository.getDepartmentById(id);}
    @Override
    public DepartmentEntity updateDepartment(DepartmentEntity department) {return repository.saveAndFlush(department);}
}

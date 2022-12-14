package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.DepartmentEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.DepartmentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.SpelQueryContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "Delete department by ID", response = DepartmentEntity.class, tags = "Department")
    @DeleteMapping(value = "/department")
    public DepartmentEntity deleteDepartmentById(@RequestParam Long id){return departmentService.deleteDepartmentById(id);}
    @ApiOperation(value = "Create new department", response = DepartmentEntity.class, tags = "Department")
    @GetMapping(value = "/department/new")
    public DepartmentEntity createDepartment(@RequestParam DepartmentEntity department){ return departmentService.createDepartment(department);}
    @ApiOperation(value = "Get department by ID", response = DepartmentEntity.class, tags = "Department")
    @GetMapping(value = "department")
    public DepartmentEntity getDepartmentById(@RequestParam Long id){return departmentService.getDepartmentById(id);}
    @ApiOperation(value = "Get all departments", response = DepartmentEntity.class, tags = "Department")
    @GetMapping(value = "departments")
    public List<DepartmentEntity> getAllDepartments(){return departmentService.getAllDepartments();}
}

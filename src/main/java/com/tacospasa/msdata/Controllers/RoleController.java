package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.*;
import com.tacospasa.msdata.Service.MenuCategoryService;
import com.tacospasa.msdata.Service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/system/user")
public class RoleController {

    @Autowired
    private RoleService service;

    @ApiOperation(value = "Get role by id", response = RoleEntity.class)
    @GetMapping(value = "/role")
    public RoleEntity getRoleById(@RequestParam Integer id) {
        return service.getRoleById(id);
    }

    @ApiOperation(value = "Get all the roles", response = RoleEntity.class)
    @GetMapping(value = "/roles")
    public List<RoleEntity> getAllRoles() {
        return service.getAllRoles();
    }

    @ApiOperation(value = "Create new Role", response = RoleEntity.class)
    @PostMapping(value = "/roles")
    public RoleEntity CreateNewRole(@RequestBody RoleEntity role) {
        return service.createNewRole(role);
    }

    @ApiOperation(value = "Add new access", response = RoleEntity.class)
    @PutMapping(value = "/role/accesses")
    public RoleEntity addAccesses(@RequestBody List<AccessEntity> access, @RequestParam Integer id) {
        return service.addAccesses(access, id);
    }
    @ApiOperation(value = "Add new access", response = RoleEntity.class)
    @PutMapping(value = "/role/access")
    public RoleEntity addAccess(@RequestBody AccessEntity access,@RequestParam Integer id) {
        return service.addAccess(access, id);
    }
}

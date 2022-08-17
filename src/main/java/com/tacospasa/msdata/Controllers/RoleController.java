package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.*;
import com.tacospasa.msdata.Service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin/user")
@Api(tags = "Role")
public class RoleController {

    @Autowired
    private RoleService service;

    @ApiOperation(value = "Get role by id", response = RoleEntity.class, tags = "Role")
    @GetMapping(value = "/role/{id}")
    public RoleEntity getRoleById(@PathVariable Long id) {
        return service.getRoleById(id);
    }

    @ApiOperation(value = "Get all the roles", response = RoleEntity.class, tags = "Role")
    @GetMapping(value = "/roles")
    public List<RoleEntity> getAllRoles() {
        return service.getAllRoles();
    }

    @ApiOperation(value = "Create new Role", response = RoleEntity.class, tags = "Role")
    @PostMapping(value = "/role")
    public RoleEntity CreateNewRole(@RequestBody RoleEntity role) {
        return service.createNewRole(role);
    }
    @ApiOperation(value = "Add new access", response = RoleEntity.class, tags = "Role")
    @PutMapping(value = "/role/access")
    public RoleEntity addAccess(@RequestBody AccessEntity access,@RequestParam Long id) {
        return service.addAccess(access, id);
    }
    @ApiOperation(value = "update role", response = RoleEntity.class, tags = "Role")
    @PutMapping(value = "/role")
    public RoleEntity addAccess(@RequestBody RoleEntity role) {  return service.updateRole(role);}
}

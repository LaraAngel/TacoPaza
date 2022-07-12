package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.AccessEntity;
import com.tacospasa.msdata.Entity.RoleEntity;

import java.util.List;

public interface RoleService {

    RoleEntity getRoleById(Long id);
    List<RoleEntity> getAllRoles();
    RoleEntity createNewRole(RoleEntity role);
    RoleEntity addAccess(AccessEntity access, Long id);

}

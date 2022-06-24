package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.AccessEntity;
import com.tacospasa.msdata.Entity.RoleEntity;

import java.util.List;

public interface RoleService {

    RoleEntity getRoleById(int id);
    List<RoleEntity> getAllRoles();
    RoleEntity createNewRole(RoleEntity role);
    RoleEntity addAccesses(List<AccessEntity> accessEntities, int id);
    RoleEntity addAccess(AccessEntity access, int id);

}

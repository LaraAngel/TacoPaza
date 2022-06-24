package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.AccessEntity;
import com.tacospasa.msdata.Entity.RoleEntity;

import java.util.List;

public interface RoleService {

    public RoleEntity getRoleById(int id);
    public List<RoleEntity> getAllRoles();
    public RoleEntity createNewRole(RoleEntity role);
    RoleEntity addAccesses(List<AccessEntity> accessEntities, int id);
    RoleEntity addAccess(AccessEntity access, int id);

}

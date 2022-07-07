package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.AccessEntity;
import com.tacospasa.msdata.Entity.RoleEntity;
import com.tacospasa.msdata.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository repository;

    @Override
    public RoleEntity getRoleById(int id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<RoleEntity> getAllRoles() {
        return repository.findAll();
    }

    @Override
    public RoleEntity createNewRole(RoleEntity role) {
        return repository.saveAndFlush(role);
    }

    @Override
    public RoleEntity addAccesses(List<AccessEntity> accessEntities, int id) {
        RoleEntity role = getRoleById(id);
        List<AccessEntity> accessFromDB = role.getAccess();
        accessFromDB.addAll(accessEntities);
        role.setAccess(accessEntities);
        return repository.saveAndFlush(role);
    }

    @Override
    public RoleEntity addAccess(AccessEntity access, int id) {
        RoleEntity role = getRoleById(id);
        List<AccessEntity> accessFromDB = role.getAccess();
        accessFromDB.add(access);
        role.setAccess(accessFromDB);
        return repository.saveAndFlush(role);    }
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.AccessEntity;

import java.util.List;

public interface AccessService{
    public AccessEntity createAccess(AccessEntity access);
    public AccessEntity createAccesses(List<AccessEntity> accessEntities);

    public List<AccessEntity> getAllAccesses();

    AccessEntity getAccessById(int id);
}

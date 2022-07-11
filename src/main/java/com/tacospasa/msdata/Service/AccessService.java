package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.AccessEntity;

import java.util.List;

public interface AccessService{
    AccessEntity createAccess(AccessEntity access);
    AccessEntity createAccesses(List<AccessEntity> accessEntities);
    List<AccessEntity> getAllAccesses();
    AccessEntity getAccessById(Long id);
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.AccessEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;
import com.tacospasa.msdata.Repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessServiceImpl implements AccessService {
    @Autowired
    private AccessRepository repository;
    @Override
    public AccessEntity createAccess(AccessEntity access) {
        return repository.saveAndFlush(access);
    }
    @Override
    public List<AccessEntity> createAccesses(List<AccessEntity> accessEntities) {
        accessEntities.stream().forEach(access -> repository.saveAndFlush(access));
        return accessEntities;
    }
    @Override
    public List<AccessEntity> getAllAccesses() {
        return repository.findAll();
    }
    @Override
    public AccessEntity getAccessById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public AccessEntity updateAccess(AccessEntity access) {return repository.saveAndFlush(access);    }
}
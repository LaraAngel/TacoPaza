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
    public AccessEntity createAccesses(List<AccessEntity> accessEntities) {
        accessEntities.stream().forEach(access -> repository.save(access));
        return new AccessEntity();
    }

    @Override
    public List<AccessEntity> getAllAccesses() {
        return repository.findAll();
    }

    @Override
    public AccessEntity getAccessById(int id) {
        return repository.getReferenceById(id);
    }
}
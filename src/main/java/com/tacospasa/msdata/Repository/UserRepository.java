package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    public UserEntity getUserByUsername(String username);

    public List<UserEntity> getUsersByStatus(String status);

    public UserEntity findById(long id);
}

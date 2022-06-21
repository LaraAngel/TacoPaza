package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public UserEntity getUserByUsername(String username);

    public List<UserEntity> getUsersByStatus(String status);

}

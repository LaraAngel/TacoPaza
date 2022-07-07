package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.RoleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public UserEntity getUserByUserName(String userName);

    public List<UserEntity> getUsersByStatus(StatusEntity status);

    List<UserEntity> getUserByRole(RoleEntity role);
}

package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.RoleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("Select user from UserEntity user where user.userName =:userName")
    public UserEntity getUserByUserName(@Param("userName") String userName);
    @Query("Select user from UserEntity user where user.status =:status")
    public List<UserEntity> getUsersByStatus(@Param("status") StatusEntity status);
    @Query("Select user from UserEntity user where :roleEntityList member user.roleEntityList")
    List<UserEntity> getUserByRole(@Param("role") RoleEntity role);
}

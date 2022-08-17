package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("Select user from UserEntity user where user.userName =:userName")
    UserEntity getUserByUserName(@Param("userName") String userName);
    @Query("Select user from UserEntity user where user.status.id =:id")
    List<UserEntity> getUsersByStatus(@Param("id") Long id);
    @Query("select u from UserEntity u join u.roleEntityList rol where rol.id = :id")
    List<UserEntity> getUserByRole(@Param("id") Long id);
    @Query("Select user from UserEntity user where user.id =:id")
    UserEntity getUserById(@Param("id") Long id);
}

package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.RoleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import java.util.List;

public interface UserService {
    UserEntity getUserById(String id);
    UserEntity getUserByUserName(String userName);
    List<UserEntity> getAllUsersByStatus(StatusEntity status);
    List<UserEntity> getAllUsers();
    UserEntity createUser(UserEntity user);
    UserEntity updateUserStatus(String id, StatusEntity status);
    UserEntity updateUser(UserEntity user);
    List<UserEntity> getAllUsersByRole(RoleEntity role);

}

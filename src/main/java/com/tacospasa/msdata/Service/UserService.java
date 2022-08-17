package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.RoleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import java.util.List;

public interface UserService {
    UserEntity getUserById(Long id);
    UserEntity getUserByUserName(String userName);
    List<UserEntity> getAllUsersByStatus(Long id);
    List<UserEntity> getAllUsers();
    UserEntity createUser(UserEntity user);
    UserEntity updateUserStatus(Long id, StatusEntity status);
    UserEntity updateUser(UserEntity user);
    List<UserEntity> getAllUsersByRole(Long id);

}

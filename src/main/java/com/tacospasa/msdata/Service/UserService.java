package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();
    UserEntity getUserById(String id);

    UserEntity getUserByUserName(String userName);

    UserEntity createUser(UserEntity user);
    UserEntity updateUserStatus(String id, StatusEntity status);
    UserEntity updateUser(UserEntity user);
    List<UserEntity> getAllUsersByStatus(StatusEntity status);
}

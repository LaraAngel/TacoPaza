package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> getAllUsers();
    public UserEntity getUserById(String id);

    UserEntity getUserByUserName(String userName);

    public UserEntity createUser(UserEntity user);
    public UserEntity updateUserStatus(String id, StatusEntity status);
    public UserEntity updateUser(UserEntity user);
    public List<UserEntity> getAllUsersByStatus(StatusEntity status);
}

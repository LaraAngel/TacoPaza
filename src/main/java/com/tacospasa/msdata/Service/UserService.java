package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> getAllUsers();
    public UserEntity getUserById(String id);

    UserEntity getUserByUsername(String username);

    public UserEntity createUser(UserEntity user);
    public UserEntity updateUserStatus(String id, String status);
    public UserEntity updateUser(UserEntity user);
    public List<UserEntity> getAllUsersByStatus(String status);
}

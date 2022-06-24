package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;

import java.util.List;

public interface UserService {

<<<<<<< Updated upstream
    UserEntity getUserByUsername(String username);

    public UserEntity createUser(UserEntity user);
    public UserEntity updateUserStatus(String id, String status);
    public UserEntity updateUser(UserEntity user);
    public List<UserEntity> getAllUsersByStatus(String status);
=======
    List<UserEntity> getAllUsers();
    UserEntity getUserById(String id);
    UserEntity getUserByUserName(String userName);
    UserEntity createUser(UserEntity user);
    UserEntity updateUserStatus(String id, StatusEntity status);
    UserEntity updateUser(UserEntity user);
    List<UserEntity> getAllUsersByStatus(StatusEntity status);
>>>>>>> Stashed changes
}

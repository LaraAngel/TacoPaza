package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.RoleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<UserEntity> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public UserEntity getUserById(String id) { return repository.findById(Integer.valueOf(id)).get();
    }

    @Override
    public UserEntity getUserByUserName(String userName) {
        return repository.getUserByUserName(userName);
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return repository.saveAndFlush(user);
    }

    @Override
    public UserEntity updateUserStatus(String id,StatusEntity status) {
        UserEntity user = getUserById(id);
        user.setStatus(status);
        return repository.saveAndFlush(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        String id_user = String.valueOf(user.getId());

        if (getUserById(id_user) != null) {
            return repository.saveAndFlush(user);
        }
        return new UserEntity();
    }

    @Override
    public List<UserEntity> getAllUsersByRole(RoleEntity role) {
        return repository.getUserByRole(role);
    }

    @Override
    public List<UserEntity> getAllUsersByStatus(StatusEntity status) {
        return repository.getUsersByStatus(status);
    }
}

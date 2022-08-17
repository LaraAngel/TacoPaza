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
    public UserEntity getUserById(Long id) { return repository.getUserById(id);}

    @Override
    public UserEntity getUserByUserName(String userName) {return repository.getUserByUserName(userName);}
    @Override
    public UserEntity createUser(UserEntity user) {return repository.saveAndFlush(user);}
    @Override
    public UserEntity updateUserStatus(Long id,StatusEntity status) {
        UserEntity user = getUserById(id);
        user.setStatus(status);
        return repository.saveAndFlush(user);}

    @Override
    public UserEntity updateUser(UserEntity user) {return repository.saveAndFlush(user);}
    @Override
    public List<UserEntity> getAllUsersByRole(Long id) {return repository.getUserByRole(id);}
    @Override
    public List<UserEntity> getAllUsersByStatus(Long id) {return repository.getUsersByStatus(id);}
}

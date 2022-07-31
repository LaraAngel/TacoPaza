package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.RoleEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/admin")
@RestController
@Api(tags = "Users")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "Get User by ID", response= UserEntity.class, tags = "Users")
    @GetMapping(value="/user/{id}")
    public UserEntity getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @ApiOperation(value = "Get user by username", response= UserEntity.class, tags = "Users")
    @GetMapping(value="/user/{userName}")
    public UserEntity getUserByUserName(@PathVariable String userName){
        return userService.getUserByUserName(userName);
    }
    @ApiOperation(value = "Get users by Status", response= UserEntity.class, tags = "Users")
    @GetMapping(value= "/user/status")
    public List<UserEntity> getAllUsersByStatus(@RequestBody StatusEntity status){
        return userService.getAllUsersByStatus(status);
    }
    @ApiOperation(value = "Get all the users", response = UserEntity.class, tags = "Users")
    @GetMapping(value = "/users")
    public List<UserEntity> getUserByRole() {
        return userService.getAllUsers();
    }
    @ApiOperation(value = "Create user", response= UserEntity.class, tags = "Users")
    @PostMapping(value = "/user")
    public UserEntity createUser(@RequestBody UserEntity user){
        return userService.createUser(user);
    }
    @ApiOperation(value = "Update user", response= UserEntity.class, tags = "Users")
    @PutMapping(value = "/user")
    public UserEntity updateUser(@RequestBody UserEntity user){
        return userService.updateUser(user);
    }
    @ApiOperation(value = "Update user status", response= UserEntity.class, tags = "Users")
    @PutMapping(value = "/user/status")
    public UserEntity updateUserStatus(@RequestParam Long id, @RequestBody StatusEntity status){
        return userService.updateUserStatus(id, status);
    }
    @ApiOperation(value = "Get user by role", response = UserEntity.class, tags = "Users")
    @GetMapping(value = "/user/role")
    public List<UserEntity> getAllUsersByRole(@RequestBody RoleEntity role){ return userService.getAllUsersByRole(role);}
}

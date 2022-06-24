package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
<<<<<<< Updated upstream
    public UserEntity getUserByUsername(String username);
=======
    UserEntity getUserByUserName(String userName);
>>>>>>> Stashed changes

    List<UserEntity> getUsersByStatus(StatusEntity status);

}

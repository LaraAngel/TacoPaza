package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.BranchEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<BranchEntity, Integer> {
    List<BranchEntity> findBranchByStatus(StatusEntity status);
    List<BranchEntity> findBranchByUser(UserEntity user);
}

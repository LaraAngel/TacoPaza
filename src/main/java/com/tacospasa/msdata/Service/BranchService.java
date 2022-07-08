package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.BranchEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;

import java.util.List;

public interface BranchService {
    BranchEntity getBranchById(Long id);
    List<BranchEntity> getAllBranches();
    List<BranchEntity> getAllBranchesByUser(UserEntity user);
    BranchEntity createNewBranch(BranchEntity branch);
    BranchEntity updateBranch(BranchEntity branch);
    List<BranchEntity> getAllBranchesByStatus(StatusEntity status);
}

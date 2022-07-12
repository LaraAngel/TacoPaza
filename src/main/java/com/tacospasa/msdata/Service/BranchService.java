package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.BranchEntity;

import java.util.List;

public interface BranchService {
    BranchEntity getBranchById(Long id);
    List<BranchEntity> getAllBranches();
    List<BranchEntity> getAllBranchesByUser(Long id);
    BranchEntity createNewBranch(BranchEntity branch);
    BranchEntity updateBranch(BranchEntity branch);
    List<BranchEntity> getAllBranchesByStatus(Long id);
}

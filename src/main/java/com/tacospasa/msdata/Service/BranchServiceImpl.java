package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.BranchEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchServiceImpl implements BranchService{
    @Autowired
    private BranchRepository repository;
    @Override
    public BranchEntity getBranchById(Long id) {
        return repository.getById(Math.toIntExact(id));
    }

    @Override
    public List<BranchEntity> getAllBranches() {
        return repository.findAll();
    }

    @Override
    public List<BranchEntity> getAllBranchesByUser(UserEntity user) {
        return repository.findBranchByUser(user);
    }

    @Override
    public BranchEntity createNewBranch(BranchEntity branch) {
        return repository.saveAndFlush(branch);
    }

    @Override
    public BranchEntity updateBranch(BranchEntity branch) {
        return repository.saveAndFlush(branch);
    }

    @Override
    public List<BranchEntity> getAllBranchesByStatus(StatusEntity status) {
        return repository.findBranchByStatus(status);
    }
}

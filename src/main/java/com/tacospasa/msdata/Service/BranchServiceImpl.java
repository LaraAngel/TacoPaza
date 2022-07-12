package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.BranchEntity;
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
        return repository.getReferenceById(id);
    }

    @Override
    public List<BranchEntity> getAllBranches() {
        return repository.findAll();
    }

    @Override
    public List<BranchEntity> getAllBranchesByUser(Long id) {
        return repository.findBranchByUser(id);
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
    public List<BranchEntity> getAllBranchesByStatus(Long id) {
        return repository.findBranchByStatus(id);
    }
}

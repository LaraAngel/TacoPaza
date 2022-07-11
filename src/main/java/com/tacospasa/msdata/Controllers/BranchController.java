package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.BranchEntity;
import com.tacospasa.msdata.Service.BranchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin")
@Api(tags = "branch")
public class BranchController {
    @Autowired
    private BranchService branchService;

    @ApiOperation(value = "get branch by id", response = BranchEntity.class, tags = "branch")
    @GetMapping(value = "/branch/{id}")
    public BranchEntity getBranchById(@PathVariable Long id){return branchService.getBranchById(id);}
    @ApiOperation(value = "get all branches", response = BranchEntity.class, tags = "branch")
    @GetMapping(value = "/branches")
    public List<BranchEntity> getAllBranches(){return branchService.getAllBranches();}
    @ApiOperation(value = "get branches by manager", response = BranchEntity.class, tags = "branch")
    @GetMapping(value = "/branches/manager")
    public List<BranchEntity> getAllBranchesByUser(@RequestParam Long id){return branchService.getAllBranchesByUser(id);}
    @ApiOperation(value = "add branch", response = BranchEntity.class, tags = "branch")
    @PostMapping(value = "/branch")
    public BranchEntity createNewBranch(@RequestBody BranchEntity branch){return branchService.createNewBranch(branch);}
    @ApiOperation(value = "update branch info", response = BranchEntity.class, tags = "branch")
    @PutMapping(value = "/branch")
    public BranchEntity updateBranch(@RequestBody BranchEntity branch){return branchService.updateBranch(branch);}
    @ApiOperation(value = "get branch by status", response = BranchEntity.class, tags = "branch")
    @GetMapping(value = "/branch")
    public List<BranchEntity> getAllBranchesByStatus(@RequestParam Long id){return branchService.getAllBranchesByStatus(id);}
}

package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.AccessEntity;
import com.tacospasa.msdata.Service.AccessService;
import com.tacospasa.msdata.Service.MenuCategoryService;
import com.tacospasa.msdata.Service.SubCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/system/user")
public class AccessController {

    @Autowired
    private AccessService service;

    @ApiOperation(value = "Create new access", response = AccessEntity.class)
    @PostMapping(value = "/access")
    public AccessEntity createAccess(@RequestBody AccessEntity access){
        return service.createAccess(access);
    }

    @ApiOperation(value = "Create new accesses", response = AccessEntity.class)
    @PostMapping(value = "/accesses")
    public AccessEntity createAccesses(@RequestBody List<AccessEntity> access){
        return service.createAccesses(access);
    }

    @ApiOperation(value = "Get all accesses", response = AccessEntity.class)
    @GetMapping(value = "/accesses")
    public List<AccessEntity> getAllAccess(){
        return service.getAllAccesses();
    }

    @ApiOperation(value = "Get access by id", response = AccessEntity.class)
    @GetMapping(value = "/access")
    public AccessEntity getAccessById(@RequestParam Integer id){
        return service.getAccessById(id);
    }
}

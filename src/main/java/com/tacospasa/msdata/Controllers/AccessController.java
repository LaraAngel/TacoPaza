package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.AccessEntity;
import com.tacospasa.msdata.Service.AccessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin")
@Api(tags = "Access")
public class AccessController {
    @Autowired
    private AccessService service;
    @ApiOperation(value = "Create new access", response = AccessEntity.class, tags = "Access")
    @PostMapping(value = "/access")
    public AccessEntity createAccess(@RequestBody AccessEntity access){
        return service.createAccess(access);
    }
    @ApiOperation(value = "Create new accesses", response = AccessEntity.class, tags = "Access")
    @PostMapping(value = "/accesses")
    public List<AccessEntity> createAccesses(@RequestBody List<AccessEntity> access){return service.createAccesses(access);}
    @ApiOperation(value = "Get all accesses", response = AccessEntity.class, tags = "Access")
    @GetMapping(value = "/accesses")
    public List<AccessEntity> getAllAccess(){
        return service.getAllAccesses();
    }
    @ApiOperation(value = "Get access by id", response = AccessEntity.class, tags = "Access")
    @GetMapping(value = "/access/{id}")
    public AccessEntity getAccessById(@PathVariable Long id){
        return service.getAccessById(id);
    }
    @ApiOperation(value = "update access", response = AccessEntity.class)
    @PutMapping(value = "/access")
    public AccessEntity updateAccess(@RequestBody AccessEntity access){return service.updateAccess(access);}
}

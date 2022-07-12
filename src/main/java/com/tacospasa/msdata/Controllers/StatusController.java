package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Service.StatusService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/system")
@Api(tags = "Status")

public class StatusController {
    @Autowired
    private StatusService statusService;

    @ApiOperation(value = "Get status by Id", response = StatusEntity.class, tags = "Status")
    @GetMapping(value = "/status/{id}")
    public StatusEntity getStatusById(@PathVariable Long id) { return statusService.getStatusById(id);}

    @ApiOperation(value = "Get all status", response = StatusEntity.class, tags = "Status")
    @GetMapping(value = "/statuses")
    public List<StatusEntity> getAllStatus() { return statusService.getAllStatus();}

    @ApiOperation(value = "Create new Status", response = StatusEntity.class, tags = "Status")
    @PostMapping(value = "/status")
    public StatusEntity createStatus(@RequestParam StatusEntity status){ return statusService.createStatus(status);}

    @ApiOperation(value = "delete Status by ID", response = StatusEntity.class, tags = "Status")
    @DeleteMapping(value = "/status")
    public ResponseEntity deleteStatusById(@RequestParam Long id){
        statusService.deleteStatusById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @ApiOperation(value = "update status entity", response = StatusEntity.class, tags = "Status")
    @PutMapping(value = "/status")
    public ResponseEntity<StatusEntity> updateStatus(@RequestBody StatusEntity status){
        return new ResponseEntity<StatusEntity>(statusService.updateStatus(status),HttpStatus.OK);
    }
}

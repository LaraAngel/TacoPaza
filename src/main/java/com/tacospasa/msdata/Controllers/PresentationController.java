package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.PresentationEntity;
import com.tacospasa.msdata.Service.PresentationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inventory")
@Api(tags = "Presentation")
public class PresentationController {
    @Autowired
    private PresentationService presentationService;

    @ApiOperation(value = "Get all presentations", response = PresentationEntity.class, tags = "Presentation")
    @GetMapping(value = "/presentation")
    public List<PresentationEntity> getAllPresentations(){return presentationService.getAllPresentations();}
    @ApiOperation(value = "Get presentation by id", response = PresentationEntity.class, tags = "Presentation")
    @GetMapping(value = "/presentations/{id}")
    public PresentationEntity getPresentationById(@PathVariable Long id){return presentationService.getPresentationById(id);}
    @ApiOperation(value = "Create new presentation", response = PresentationEntity.class, tags = "Presentation")
    @PostMapping(value = "/presentation")
    public PresentationEntity createPresentation(@RequestBody PresentationEntity presentation){return presentationService.createPresentation(presentation);}
    @ApiOperation(value = "Update presentation", response = PresentationEntity.class, tags = "Presentation")
    @PutMapping(value = "/presentation")
    public PresentationEntity updatePresentation(@RequestBody PresentationEntity presentation){ return presentationService.updatePresentation(presentation);}
}

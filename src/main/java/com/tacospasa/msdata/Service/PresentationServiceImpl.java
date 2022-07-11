package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.PresentationEntity;
import com.tacospasa.msdata.Repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PresentationServiceImpl implements PresentationService {
    @Autowired
    private PresentationRepository repository;
    @Override
    public PresentationEntity getPresentationById(Long id) {
        return repository.getReferenceById(id);
    }
    @Override
    public List<PresentationEntity> getAllPresentations() {
        return repository.findAll();
    }
    @Override
    public PresentationEntity createPresentation(PresentationEntity presentation) {
        return repository.saveAndFlush(presentation);
    }
    @Override
    public PresentationEntity updatePresentation(PresentationEntity presentation) {
        Long id = presentation.getId();
        if (getPresentationById(id) != null) {
            return repository.saveAndFlush(presentation);
        }
        return new PresentationEntity();
    }
}

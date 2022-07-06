package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.PresentationEntity;

import java.util.List;

public interface PresentationService {
    PresentationEntity getPresentationById(Long id);
    List<PresentationEntity> getAllPresentations();
    PresentationEntity createPresentation(PresentationEntity presentation);
    PresentationEntity updatePresentation(PresentationEntity presentation);
}

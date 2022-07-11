package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.StatusEntity;

import java.util.List;

public interface StatusService {
    List<StatusEntity> getAllStatus();
    StatusEntity getStatusById(Long id);
    StatusEntity createStatus(StatusEntity status);
    void deleteStatusById(Long id);
    StatusEntity updateStatus(StatusEntity status);
}

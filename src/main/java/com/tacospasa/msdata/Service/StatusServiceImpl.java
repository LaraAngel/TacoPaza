package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusServiceImpl implements StatusService{
    @Autowired
    private StatusRepository repository;
    @Override
    public List<StatusEntity> getAllStatus() { return repository.findAll();  }
    @Override
    public StatusEntity getStatusById(Long id) { return repository.getStatusById(id);   }
    @Override
    public StatusEntity createStatus(StatusEntity status) { return repository.saveAndFlush(status);    }
    @Override
    public void deleteStatusById(Long id) { repository.deleteById(id);    }
    @Override
    public StatusEntity updateStatus(StatusEntity status) {return repository.saveAndFlush(status);}

}

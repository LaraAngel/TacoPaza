package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<StatusEntity, Integer> {
    StatusEntity findById(Long id);

    StatusEntity deleteById(Long id);
}

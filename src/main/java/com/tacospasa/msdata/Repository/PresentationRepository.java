package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.PresentationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentationRepository extends JpaRepository<PresentationEntity,Long> {
}

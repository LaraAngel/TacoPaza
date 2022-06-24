package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.AccessEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessRepository extends JpaRepository<AccessEntity, Integer> {
}

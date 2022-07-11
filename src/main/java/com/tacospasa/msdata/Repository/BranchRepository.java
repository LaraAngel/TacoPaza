package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.BranchEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BranchRepository extends JpaRepository<BranchEntity, Long> {
    @Query("Select brnch from BranchEntity brnch where brnch.status.id =:id")
    List<BranchEntity> findBranchByStatus(@Param("id") Long id);
    @Query("Select brnch from BranchEntity brnch where brnch.manager.id =:id")
    List<BranchEntity> findBranchByUser(@Param("id") Long id);
}

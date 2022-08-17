package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    @Query("select r from RoleEntity r where r.id = :id")
    RoleEntity getRoleById(@Param("id") Long id);
}

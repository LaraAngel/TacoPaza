package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StatusRepository extends JpaRepository<StatusEntity, Long> {

     @Query("Select st from StatusEntity st where st.id = :id")
    StatusEntity getStatusById(@Param("id")Long id);
}

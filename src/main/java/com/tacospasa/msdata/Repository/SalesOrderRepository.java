package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.SalesOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface SalesOrderRepository extends JpaRepository<SalesOrderEntity,Long> {
    @Query("Select order from SalesOrderEntity order where order.branch.id =:id")
    List<SalesOrderEntity> findAllSalesOrderByBranchId(@Param("id") Long id);
    @Query("Select order from SalesOrderEntity order where order.status.id =:id")
    List<SalesOrderEntity> findAllSalesOrderByStatusId(@Param("id") Long id);
    @Query("Select order from SalesOrderEntity order where order.responsible.id =:id")
    List<SalesOrderEntity> findAllSalesOrderByResponsibleId(@Param("id") Long id);
    @Query("Select order from SalesOrderEntity order where order.date =:date")
    List<SalesOrderEntity> findAllSalesOrderByDate(@Param("date") Date date);
    @Query("Select order from SalesOrderEntity order where order.time =:time")
    List<SalesOrderEntity> findAllSalesOrderByTime(@Param("time") Time time);
}

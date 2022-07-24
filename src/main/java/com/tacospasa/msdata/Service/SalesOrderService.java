package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.SalesOrderEntity;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface SalesOrderService {
    SalesOrderEntity getSalesOrderById(Long id);
    List<SalesOrderEntity> getAllSalesOrder();
    SalesOrderEntity createSalesOrder(SalesOrderEntity salesOrder);
    SalesOrderEntity updateSalesOrder(SalesOrderEntity salesOrder);
    List<SalesOrderEntity> getAllSalesOrderByTime(Time time);
    List<SalesOrderEntity> getAllSalesOrderByDate(Date date);
    List<SalesOrderEntity> getAllSalesOrderByStatusId(Long id);
    List<SalesOrderEntity> getAllSalesOrderByBranchId(Long id);
    List<SalesOrderEntity> getAllSalesOrderByResponsibleId(Long id);
}

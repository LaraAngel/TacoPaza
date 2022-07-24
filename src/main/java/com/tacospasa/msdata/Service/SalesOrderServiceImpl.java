package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.SalesOrderEntity;
import com.tacospasa.msdata.Repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class SalesOrderServiceImpl implements SalesOrderService{
    @Autowired
    private SalesOrderRepository repository;
    @Override
    public SalesOrderEntity getSalesOrderById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<SalesOrderEntity> getAllSalesOrder() {
        return repository.findAll();
    }

    @Override
    public SalesOrderEntity createSalesOrder(SalesOrderEntity salesOrder) {
        return repository.saveAndFlush(salesOrder);
    }

    @Override
    public SalesOrderEntity updateSalesOrder(SalesOrderEntity salesOrder) {
        return repository.saveAndFlush(salesOrder);
    }

    @Override
    public List<SalesOrderEntity> getAllSalesOrderByTime(Time time) {
        return repository.findAllSalesOrderByTime(time);    }

    @Override
    public List<SalesOrderEntity> getAllSalesOrderByDate(Date date) {
        return repository.findAllSalesOrderByDate(date);
    }

    @Override
    public List<SalesOrderEntity> getAllSalesOrderByStatusId(Long id) {
        return repository.findAllSalesOrderByStatusId(id);
    }

    @Override
    public List<SalesOrderEntity> getAllSalesOrderByBranchId(Long id) {
        return repository.findAllSalesOrderByBranchId(id);
    }

    @Override
    public List<SalesOrderEntity> getAllSalesOrderByResponsibleId(Long id) {
        return repository.findAllSalesOrderByResponsibleId(id);
    }
}



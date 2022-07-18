package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.CashBalanceEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Repository.CashBalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CashBalanceServiceImpl implements CashBalanceService {
    @Autowired
    private CashBalanceRepository repository;

    @Override

    public CashBalanceEntity getCashBalanceById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<CashBalanceEntity> getAllCashBalance() {

        return repository.findAll();
    }

    @Override
    public CashBalanceEntity createCashBalance(CashBalanceEntity cashBalance) {

        return repository.saveAndFlush(cashBalance);
    }

    @Override
    public CashBalanceEntity updateCashBalance(CashBalanceEntity cashBalance) {
        return repository.saveAndFlush(cashBalance);
    }

    @Override
    public CashBalanceEntity getCashBalanceByUserEntity(Long id) {
        return repository.getCashBalanceByUserEntity(id);
    }

    @Override
    public CashBalanceEntity getCashBalanceByDate(Date date) {
        return repository.getCashBalanceByDate(date);
    }

    @Override
    public CashBalanceEntity getCashBalanceByStatus(Long id) {
        return repository.getCashBalanceByStatus(id);
    }
}

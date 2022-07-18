package com.tacospasa.msdata.Service;

import com.tacospasa.msdata.Entity.CashBalanceEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Entity.UserEntity;
import com.tacospasa.msdata.Repository.CashBalanceRepository;

import java.util.Date;
import java.util.List;

public interface CashBalanceService {

    CashBalanceEntity getCashBalanceById(Long id);
    List<CashBalanceEntity> getAllCashBalance();
    CashBalanceEntity createCashBalance(CashBalanceEntity cashBalance);
    CashBalanceEntity updateCashBalance(CashBalanceEntity cashBalance);
    CashBalanceEntity getCashBalanceByUserEntity(Long id);
    CashBalanceEntity getCashBalanceByDate(Date date);
    CashBalanceEntity getCashBalanceByStatus(Long id);

}

package com.tacospasa.msdata.Repository;

import com.tacospasa.msdata.Entity.CashBalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface CashBalanceRepository extends JpaRepository<CashBalanceEntity,Long> {

    @Query("select cash from CashBalanceEntity cash where cash.id = :id")
    CashBalanceEntity getCashBalanceByUserEntity(@Param("user") Long id);

    @Query("select cash from CashBalanceEntity cash where cash.date = :date")
    CashBalanceEntity getCashBalanceByDate(@Param("date") Date date);

    @Query("select cash from CashBalanceEntity cash where cash.id = :id")
    CashBalanceEntity getCashBalanceByStatus(@Param("status") Long id);
}


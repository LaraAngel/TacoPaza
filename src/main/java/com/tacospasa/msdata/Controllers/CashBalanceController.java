package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.CashBalanceEntity;
import com.tacospasa.msdata.Entity.PaymentEntity;
import com.tacospasa.msdata.Entity.PaymentMethodEntity;
import com.tacospasa.msdata.Entity.StatusEntity;
import com.tacospasa.msdata.Repository.PaymentRepository;
import com.tacospasa.msdata.Service.CashBalanceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

public class CashBalanceController {

    @Autowired
    private CashBalanceService cashBalanceService;

    @ApiOperation(value = "get cash balance by id",response = CashBalanceEntity.class)
    @GetMapping(value = "/payment/cash-balance/{id}")
    ResponseEntity <CashBalanceEntity> getCashBalanceById(@PathVariable Long id) {
        return new ResponseEntity<>(cashBalanceService.getCashBalanceById(id),HttpStatus.OK);
    }

    @ApiOperation(value = "get all cash balance",response = CashBalanceEntity.class)
    @GetMapping(value = "/payment/cash-balances")
     ResponseEntity<List<CashBalanceEntity>> getAllCashBalance() {
        return new ResponseEntity<>(cashBalanceService.getAllCashBalance(),HttpStatus.OK);
    }

    @ApiOperation(value = "create cash balance",response = CashBalanceEntity.class)
    @GetMapping(value = "/payment/cash-balance")
    ResponseEntity<CashBalanceEntity> createCashBalance(@RequestBody CashBalanceEntity cashBalance) {
        return new ResponseEntity<>(cashBalanceService.createCashBalance(cashBalance),HttpStatus.OK);
    }

    @ApiOperation(value = "update cash balance",response = CashBalanceEntity.class)
    @GetMapping(value = "/payment/cash-balance")
    ResponseEntity<CashBalanceEntity> updateCashBalance(@RequestBody CashBalanceEntity cashBalance) {
        return new ResponseEntity<>(cashBalanceService.updateCashBalance(cashBalance),HttpStatus.OK);
    }

    @ApiOperation(value = "get cash balance by manager",response = CashBalanceEntity.class)
    @GetMapping(value = "/payment/cash-balances/manager")
    ResponseEntity<CashBalanceEntity> getCashBalanceByUserEntity(@RequestParam Long id) {
        return new ResponseEntity<>(cashBalanceService.getCashBalanceByUserEntity(id),HttpStatus.OK);
    }

    @ApiOperation(value = "get cash balance by date",response = CashBalanceEntity.class)
    @GetMapping(value = "/payment/cash-balances/date")
    ResponseEntity<CashBalanceEntity> getCashBalanceByDate(@RequestParam Date date) {
        return new ResponseEntity<>(cashBalanceService.getCashBalanceByDate(date),HttpStatus.OK);
    }

    @ApiOperation(value = "get cash balance by status",response = CashBalanceEntity.class)
    @GetMapping(value = "/payment/cash-balances/status")
    ResponseEntity<CashBalanceEntity> getCashBalanceByStatus(@RequestParam Long id) {
        return new ResponseEntity<>(cashBalanceService.getCashBalanceByStatus(id),HttpStatus.OK);
    }
}

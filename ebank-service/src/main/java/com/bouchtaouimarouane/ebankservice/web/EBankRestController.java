package com.bouchtaouimarouane.ebankservice.web;


import com.bouchtaouimarouane.ebankservice.dto.CurrencyTransferResponse;
import com.bouchtaouimarouane.ebankservice.dto.NewWalletTransferRequest;
import com.bouchtaouimarouane.ebankservice.entities.CurrencyDeposit;
import com.bouchtaouimarouane.ebankservice.service.EBankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EBankRestController {
    @Autowired
    private EBankServiceImpl eBankService;
    @PostMapping("/currencyTransfer")
    @PreAuthorize("hasAuthority('ADMIN')")
    public CurrencyTransferResponse currencyTransfer(@RequestBody NewWalletTransferRequest request){
        return this.eBankService.newWalletTransaction(request);
    }
    @GetMapping("/currencyDeposits")
    @PreAuthorize("hasAuthority('USER')")
    public List<CurrencyDeposit> currencyDepositList(){
        return eBankService.currencyDeposits();
    }
}

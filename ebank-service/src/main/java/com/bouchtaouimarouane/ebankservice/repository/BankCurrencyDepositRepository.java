package com.bouchtaouimarouane.ebankservice.repository;


import com.bouchtaouimarouane.ebankservice.entities.CurrencyDeposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankCurrencyDepositRepository extends JpaRepository<CurrencyDeposit, String> {
}

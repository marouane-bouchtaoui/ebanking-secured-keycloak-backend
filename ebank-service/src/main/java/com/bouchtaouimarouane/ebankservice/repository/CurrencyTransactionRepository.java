package com.bouchtaouimarouane.ebankservice.repository;


import com.bouchtaouimarouane.ebankservice.entities.CurrencyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyTransactionRepository extends JpaRepository<CurrencyTransaction, String> {
}

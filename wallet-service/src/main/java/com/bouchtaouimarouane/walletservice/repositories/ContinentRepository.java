package com.bouchtaouimarouane.walletservice.repositories;


import com.bouchtaouimarouane.walletservice.entities.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepository extends JpaRepository<Continent,Long> {
    Continent findByContinentName(String continentName);
}

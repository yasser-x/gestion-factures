package com.example.facture.repositories;

import com.example.facture.entities.Facteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacteurRepo extends JpaRepository<Facteur, Long> {
}

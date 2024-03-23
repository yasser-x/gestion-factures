package com.example.facture.repositories;

import com.example.facture.entities.Colis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColisRepo extends JpaRepository<Colis , Long> {
}

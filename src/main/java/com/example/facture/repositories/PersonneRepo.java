package com.example.facture.repositories;

import com.example.facture.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepo extends JpaRepository<Personne ,Long> {
}

package com.example.facture.repositories;

import com.example.facture.entities.CentrePostal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentrePostalRepo extends JpaRepository<CentrePostal , Long> {
}

package com.example.facture.repositories;

import com.example.facture.entities.Habitant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitantRepo extends JpaRepository<Habitant , Long> {
}

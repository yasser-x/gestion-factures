package com.example.facture.services;

import com.example.facture.entities.Facteur;
import com.example.facture.repositories.FacteurRepo;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public class FacteurService {
    private FacteurRepo facteurRepo ;

    public FacteurService() {
    }

    public FacteurService(FacteurRepo facteurRepo) {
        this.facteurRepo = facteurRepo;
    }

    public List<Facteur> getAll(){
        return this.facteurRepo.findAll() ;
    }

    public Facteur findFacteurById(Long id ){
        return this.facteurRepo.findById(id).orElseThrow(()->new RuntimeException("pas de facteur")) ;
    }

    public Facteur addFacteur(Facteur facteur) {
        return this.facteurRepo.save(facteur) ;

    }

    public void deleteFacteur(Facteur facteur) {
        this.facteurRepo.delete(facteur);
    }

    public Facteur updateFacteur(Facteur facteur ) {
        if (this.findFacteurById(facteur.getId())!= null){
            return this.facteurRepo.save(facteur) ;
        }
        return null ;
    }



}

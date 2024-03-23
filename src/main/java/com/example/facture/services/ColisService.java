package com.example.facture.services;

import com.example.facture.entities.Colis;
import com.example.facture.repositories.ColisRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColisService {
    private ColisRepo colisRepo ;

    public ColisService(ColisRepo colisRepo) {
        this.colisRepo = colisRepo;
    }

    public ColisService() {
    }
    public List<Colis> getAll(){
        return this.colisRepo.findAll() ;
    }

    public Colis getColisById(Long id){
        return this.colisRepo.findById(id).orElseThrow(()->new RuntimeException("pas de colis")) ;
    }

    public Colis addColis(Colis colis){
        return this.colisRepo.save(colis) ;
    }
    public void deleteColis(Colis colis){
        this.colisRepo.delete(colis);
    }

    public Colis updateCollis(Colis colis){
        if (this.getColisById(colis.getNumero())!=null){
            return this.colisRepo.save(colis) ;
        }
        return null ;

    }

}

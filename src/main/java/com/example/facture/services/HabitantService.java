package com.example.facture.services;

import com.example.facture.entities.Habitant;
import com.example.facture.repositories.HabitantRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitantService {
    private HabitantRepo habitantRepo ;

    public HabitantService(HabitantRepo habitantRepo) {
        this.habitantRepo = habitantRepo;
    }

    public HabitantService() {
    }

    public List<Habitant> getAll(){
        return  this.habitantRepo.findAll() ;
    }

    public Habitant getHabitantById(Long id ){
        return this.habitantRepo.findById(id).orElseThrow(()->new RuntimeException("pas d'habitants")) ;
    }

    public Habitant addHabitant(Habitant habitant){
        return this.habitantRepo.save(habitant) ;
    }
    public  void deleteHabitant(Habitant habitant){
        this.habitantRepo.delete(habitant);
    }

    public  Habitant updateHabitant(Habitant habitant){
        if (this.getHabitantById(habitant.getId())!=null){
            return this.habitantRepo.save(habitant) ;
        }
        return null ;
    }
}

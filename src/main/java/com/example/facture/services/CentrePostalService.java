package com.example.facture.services;

import com.example.facture.entities.CentrePostal;
import com.example.facture.entities.Colis;
import com.example.facture.entities.Facteur;
import com.example.facture.entities.Habitant;
import com.example.facture.repositories.CentrePostalRepo;
import com.example.facture.repositories.ColisRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CentrePostalService {
    private CentrePostalRepo centrePostalRepo ;
    private FacteurService facteurService ;
    private HabitantService habitantService ;
    private ColisRepo colisRepo ;

    private ColisService colisService ;

    public CentrePostalService(CentrePostalRepo centrePostalRepo) {
        this.centrePostalRepo = centrePostalRepo;
    }

    public CentrePostalService() {
    }

    public List<CentrePostal> getAll(){
        return this.centrePostalRepo.findAll() ;
    }

    public CentrePostal getCentreById(Long id ){
        return this.centrePostalRepo.findById(id).orElseThrow(()->new RuntimeException("pas de centres postal"));

    }

    public CentrePostal addCentrePostal(CentrePostal centrePostal){
        return  this.centrePostalRepo.save(centrePostal);
    }
    public void deleteCentrePostal(CentrePostal centrePostal){
        this.centrePostalRepo.delete(centrePostal);
    }

    public CentrePostal updateCentrePostal(CentrePostal centrePostal){
        if (this.getCentreById(centrePostal.getId())!= null){
            return this.centrePostalRepo.save(centrePostal) ;

        }
        return  null ;
    }

    public Colis deposerColis(Long idDestin , Long idEmett ,Long idFacteur , CentrePostal centrePostal, Colis colis){
        Facteur f =  this.facteurService.findFacteurById(idFacteur) ;
        Habitant emetteur = this.habitantService.getHabitantById(idEmett);
        Habitant destinataire = this.habitantService.getHabitantById(idDestin);
        colis.getTransits().add(centrePostal) ;
        centrePostal.getColis().add(colis) ;

        colis.setDestinataire(destinataire);
        colis.setEmetteur(emetteur);
        centrePostalRepo.save(centrePostal) ;
        colisRepo.save(colis) ;

        return  colis ;


    }

}

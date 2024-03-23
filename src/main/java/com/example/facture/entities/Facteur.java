package com.example.facture.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Facteur extends Personne{


    public Facteur(String nom, String prenom, String rue, String ville, String quartier) {
        super(nom, prenom, rue, ville, quartier);
    }

    @ManyToOne(fetch = FetchType.EAGER)
    private CentrePostal emploi ;

    @OneToMany(mappedBy = "livreur" , fetch = FetchType.EAGER)
    private List<Colis> colis = new ArrayList<>();

    public Facteur() {

    }

    public CentrePostal getEmploi() {
        return emploi;
    }

    public void setEmploi(CentrePostal emploi) {
        this.emploi = emploi;
    }

    public List<Colis> getColis() {
        return colis;
    }

    public void setColis(List<Colis> colis) {
        this.colis = colis;
    }
}

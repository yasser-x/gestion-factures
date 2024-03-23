package com.example.facture.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Habitant extends Personne{
    private String email ;
    private String telephone ;

    @ManyToOne(fetch = FetchType.EAGER)
    private CentrePostal servir ;

    @OneToMany(mappedBy = "emetteur" , fetch = FetchType.EAGER)
    private List<Colis> colisemis = new ArrayList<>() ;

    @OneToMany(mappedBy = "recepteur" , fetch = FetchType.EAGER)
    private List<Colis> colisrecepteur = new ArrayList<>() ;





    public Habitant() {

    }

    public Habitant(String nom, String prenom, String rue, String ville, String quartier, String email, String telephone) {
        super(nom, prenom, rue, ville, quartier);
        this.email = email;
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CentrePostal getServir() {
        return servir;
    }

    public void setServir(CentrePostal servir) {
        this.servir = servir;
    }

    public List<Colis> getColisemis() {
        return colisemis;
    }

    public void setColisemis(List<Colis> colisemis) {
        this.colisemis = colisemis;
    }

    public List<Colis> getColisrecepteur() {
        return colisrecepteur;
    }

    public void setColisrecepteur(List<Colis> colisrecepteur) {
        this.colisrecepteur = colisrecepteur;
    }
}

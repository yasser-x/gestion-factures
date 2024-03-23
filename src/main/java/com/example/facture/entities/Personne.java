package com.example.facture.entities;

import jakarta.persistence.*;

@Entity
@Inheritance
public class Personne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom ;
    private String prenom ;
    private String rue ;
    private String ville ;
    private  String quartier ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public Personne() {
    }

    public Personne(String nom, String prenom, String rue, String ville, String quartier) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        this.quartier = quartier;
    }


}

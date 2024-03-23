package com.example.facture.entities;

import jakarta.persistence.*;
import org.springframework.context.event.SmartApplicationListener;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CentrePostal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom ;
    private int numero ;
    private String rue ;
    private String quartier ;
    private String ville ;

    @OneToMany(mappedBy = "emploi" , fetch = FetchType.EAGER)
    private List<Facteur> facteurs = new ArrayList<>() ;

    @ManyToMany(mappedBy = "transits" ,  fetch = FetchType.EAGER)
    private List<Colis> colis = new ArrayList<>() ;

    @OneToMany(mappedBy = "servir" ,  fetch = FetchType.EAGER)
    private List<Habitant> habitants = new ArrayList<>() ;

    public CentrePostal() {
    }

    public CentrePostal(Long id, String nom, int numero, String rue, String quartier, String ville) {
        this.id = id;
        this.nom = nom;
        this.numero = numero;
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
    }

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Facteur> getFacteurs() {
        return facteurs;
    }

    public void setFacteurs(List<Facteur> facteurs) {
        this.facteurs = facteurs;
    }

    public List<Colis> getColis() {
        return colis;
    }

    public void setColis(List<Colis> colis) {
        this.colis = colis;
    }

    public List<Habitant> getHabitants() {
        return habitants;
    }

    public void setHabitants(List<Habitant> habitants) {
        this.habitants = habitants;
    }
}

package com.example.facture.entities;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Colis {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero ;
    private Date dateDepot ;
    private Date dateReception ;

    public Colis(Long numero, Date dateDepot, Date dateReception) {
        this.numero = numero;
        this.dateDepot = dateDepot;
        this.dateReception = dateReception;
    }
    @ManyToOne(fetch = FetchType.EAGER)
    private Facteur livreur ;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<CentrePostal> transits = new ArrayList<>() ;

    @ManyToOne(fetch = FetchType.EAGER)
    private Habitant emetteur  ;

    @ManyToOne(fetch = FetchType.EAGER)
    private Habitant destinataire ;

    public Colis() {
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public Facteur getLivreur() {
        return livreur;
    }

    public void setLivreur(Facteur livreur) {
        this.livreur = livreur;
    }

    public List<CentrePostal> getTransits() {
        return transits;
    }

    public void setTransits(List<CentrePostal> transits) {
        this.transits = transits;
    }

    public Habitant getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Habitant emetteur) {
        this.emetteur = emetteur;
    }

    public Habitant getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Habitant destinataire) {
        this.destinataire = destinataire;
    }
}

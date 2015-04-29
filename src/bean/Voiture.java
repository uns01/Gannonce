/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author win7
 */
@Entity
public class Voiture {
    @Id
    @GeneratedValue 
    private int id ;
    private String marque ;
    private String typeCarburant;
    private String modele;
    private String vitesse ;
    @OneToOne
    private Annonce annonce;
//////////////////////////////////////////////////////////////////////////////////////////////////////
    public Voiture(){}

    public Voiture(String marque, String typeCarburant, String modele, String vitesse, Annonce annonce) {
        this.marque = marque;
        this.typeCarburant = typeCarburant;
        this.modele = modele;
        this.vitesse = vitesse;
        this.annonce = annonce;
    }

    public Voiture(int id, String marque, String typeCarburant, String modele, String vitesse, Annonce annonce) {
        this.id = id;
        this.marque = marque;
        this.typeCarburant = typeCarburant;
        this.modele = modele;
        this.vitesse = vitesse;
        this.annonce = annonce;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getVitesse() {
        return vitesse;
    }

    public void setVitesse(String vitesse) {
        this.vitesse = vitesse;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author win7
 */
@Entity
public class Annonceur {
    @Id
    @GeneratedValue 
    private int id;
    private String nom;
    private String prenom;
    private String Ville;
    @OneToOne
    private Compte compte;
///////////////////////////////////////////////////////////////////////////////////////////////////////

    public Annonceur() {
    }

    public Annonceur(String nom, String prenom, String Ville, Compte compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.Ville = Ville;
        this.compte = compte;
    }

    public Annonceur(int id, String nom, String prenom, String Ville, Compte compte) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.Ville = Ville;
        this.compte = compte;
    }
   
///////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
   
}

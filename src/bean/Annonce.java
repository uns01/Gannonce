/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author win7
 */
@Entity
public class Annonce {
    @Id
    @GeneratedValue 
    private int id;
    private String titre;
    private String description;
    private String ville;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAnnonce;
    private double prix;
    private int nbLike;
    private List<String> photos = new ArrayList<String>();
    @ManyToOne
    private Compte compte;
    @OneToOne
    private Voiture voiture;
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Annonce(){}
    public Annonce( int id, String titre, String description, String ville, Date dateAnnonce, double prix, int nbLike, Compte compte, Voiture voiture) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.ville = ville;
        this.dateAnnonce = dateAnnonce;
        this.prix = prix;
        this.nbLike = nbLike;
        this.compte = compte;
        this.voiture = voiture;
    }
    public Annonce( String titre, String description, String ville, Date dateAnnonce, double prix, int nbLike, Compte compte, Voiture voiture) {
        this.titre = titre;
        this.description = description;
        this.ville = ville;
        this.dateAnnonce = dateAnnonce;
        this.prix = prix;
        this.nbLike = nbLike;
        this.compte = compte;
        this.voiture = voiture;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDateAnnonce() {
        return dateAnnonce;
    }

    public void setDateAnnonce(Date dateAnnonce) {
        this.dateAnnonce = dateAnnonce;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbLike() {
        return nbLike;
    }

    public void setNbLike(int nbLike) {
        this.nbLike = nbLike;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
   

}

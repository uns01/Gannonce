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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author win7
 */
@Entity
public class Compte {
    @Id
    @GeneratedValue 
    private int id ;
    private String mail;
    private String psw;
    @OneToOne   
    private Annonceur annonceur;
    @OneToMany
    private List<Annonce> annonces=new ArrayList<>();
///////////////////////////////////////////////////////////////////////////////////////////////////////
    public Compte (){}

    public Compte(String mail, String psw, Annonceur annonceur) {
        this.mail = mail;
        this.psw = psw;
        this.annonceur = annonceur;
    }

    public Compte(int id, String mail, String psw, Annonceur annonceur) {
        this.id = id;
        this.mail = mail;
        this.psw = psw;
        this.annonceur = annonceur;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Annonceur getAnnonceur() {
        return annonceur;
    }

    public void setAnnonceur(Annonceur annonceur) {
        this.annonceur = annonceur;
    }

    public List<Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(List<Annonce> annonces) {
        this.annonces = annonces;
    }
       
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Annonce;
import bean.Compte;
import dao.CompteDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rahma
 */
public class CompteService {
    
    private CompteDao compteDao = new CompteDao();
    private AnnonceService annonceService=new AnnonceService();
    private VoitureService voitureService =new VoitureService();
    
     private List<Annonce> annonces ;
    
    public void delete (Compte compte){
        annonces=annonceService.getAnnonceDao().findAll();
        for(int i=0 ; i<annonces.size(); i++){
           voitureService.getVoitureDao().delete(annonces.get(i).getVoiture());
           annonceService.getAnnonceDao().delete(annonces.get(i));
        }
        compteDao.delete(compte);
    }
}

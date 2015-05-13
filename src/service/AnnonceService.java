/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import dao.AnnonceDao;

/**
 *
 * @author rahma
 */
public class AnnonceService {
    private AnnonceDao annonceDao = new AnnonceDao();

    public AnnonceDao getAnnonceDao() {
        return annonceDao;
    }

    public void setAnnonceDao(AnnonceDao annonceDao) {
        this.annonceDao = annonceDao;
    }
    public void findByCompte(Compte compte){
        String hql="from Annonce  a WHERE a.compte.id=Compte.id";
        
        System.out.println(""+annonceDao.load(hql).get(0).getTitre());
    }
}

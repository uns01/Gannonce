/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Voiture;
import dao.VoitureDao;

/**
 *
 * @author rahma
 */
public class VoitureService {
    private VoitureDao voitureDao = new VoitureDao();

    public VoitureDao getVoitureDao() {
        return voitureDao;
    }
    public static void main(String[] args) {
    }
    public void setVoitureDao(VoitureDao voitureDao) {
        this.voitureDao = voitureDao;
    }
    
}

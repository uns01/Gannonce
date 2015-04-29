/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Annonce;
import bean.Annonceur;

/**
 *
 * @author rahma
 */
public class AnnonceDao extends AbstractDao<Annonce> {

    public AnnonceDao() {
        super(Annonce.class);
    }
    
}

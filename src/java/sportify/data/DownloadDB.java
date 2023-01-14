/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sportify.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import sportify.business.*;

/**
 *
 * @author Admin
 */
public class DownloadDB {

    public static void insert(Download download) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(download);
            trans.commit();
        } catch(Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }    
}
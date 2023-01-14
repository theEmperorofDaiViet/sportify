/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sportify.data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 */
public class DBUtil {

    public static final EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sportifyPU");
    
    public static EntityManagerFactory getEmFactory(){
        return emf;
    }
}

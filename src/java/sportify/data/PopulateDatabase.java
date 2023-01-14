/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* If the Products table in the music_jpa database doesn't contain any records,
 * you can use this class to populate the Product table.
 *
 * To do this in NetBeans, press SHIFT+F6
 * while in this window, or right click and select Run File. It is normal for
 * it to take a few minutes to run.
 *
 * After you have done this, you will want to change the
 * javax.persistence.schema-generation.database.action value in the
 * persistence.xml file to "none". Otherwise, the application will pause for
 * two or three minutes each time you start it when it first makes a database
 * call.
*/

package sportify.data;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceUnitTransactionType;
import sportify.business.Product;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_DRIVER;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_PASSWORD;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_URL;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_USER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.TARGET_SERVER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.TRANSACTION_TYPE;
import org.eclipse.persistence.config.TargetServer;

/**
 *
 * @author Admin
 */
public class PopulateDatabase {
    
    private static EntityManagerFactory emf;
    
    public static void insertProduct(Product product) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(product);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
    }
    
    public static void main(String[] args) {
        Map props = new HashMap();
        props.put(TRANSACTION_TYPE,
                PersistenceUnitTransactionType.RESOURCE_LOCAL.name());
        props.put(JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
        props.put(JDBC_URL, "jdbc:mysql://localhost:3306/sportifymusic_jpa?zeroDateTimeBehavior=convertToNull");
        props.put(JDBC_USER, "root");
        props.put(JDBC_PASSWORD, "05012001");
        props.put(TARGET_SERVER, TargetServer.None);
        
        emf = Persistence.createEntityManagerFactory("sportifyPU", props);
        
        
        Product product1 = new Product();
        product1.setCode("FWC10");
        product1.setDescription("Various Artists - FIFA World Cup South Africa 2010 (Official Soundtrack)");
        product1.setPrice(14.95);
        insertProduct(product1);
        
        Product product2 = new Product();
        product2.setCode("FWC14");
        product2.setDescription("Various Artists - FIFA World Cup Brazil 2014 (Official Soundtrack)");
        product2.setPrice(12.95);
        insertProduct(product2);
        
        Product product3 = new Product();
        product3.setCode("FWC18");
        product3.setDescription("Various Artists - FIFA World Cup Russia 2018 (Official Soundtrack)");
        product3.setPrice(14.95);
        insertProduct(product3);
        
        Product product4 = new Product();
        product4.setCode("FWC22");
        product4.setDescription("Various Artists - FIFA World Cup Qatar 2022 (Official Soundtrack)");
        product4.setPrice(14.95);
        insertProduct(product4);
    }
}

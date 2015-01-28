/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import DAL.Wijntbl;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Christel
 */
@Startup
@Singleton
public class WijnServices {

    // variabele --> in geheugen
    
    private List<Wijntbl> wijnen;

    public WijnServices() {
        System.out.println("WijnServices() begin");
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntbl");
        wijnen = q.list();
        System.out.println("WijnServices() einde" + wijnen);
    }

    public static List<Wijntbl> GetAllWijnen(String qString) {
        System.out.println("begin GetAllWijnen " + qString);
        Session session
                = HibernateUtil.getSessionFactory().openSession();

        Query q = session.createQuery(qString);
        System.out.println("na query GetAllWijnen " + qString);
        return q.list();

    }

    public static Wijntbl getWijn(int ID) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntbl wijn where Wijntbl.id=" + ID);
        return (Wijntbl) q.uniqueResult();
    }

}

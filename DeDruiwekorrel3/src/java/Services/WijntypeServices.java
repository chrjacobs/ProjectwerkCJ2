/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import DAL.Wijnhuistbl;
import DAL.Wijntypetbl;
import ViewModels.LijstWijntypeViewModel;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Christel
 */
@Startup
@Singleton
public class WijntypeServices {

    // variabele --> in geheugen
    private List<Wijntypetbl> wijntypes;

    public WijntypeServices() {
        System.out.println("WijntypeServices() begin");
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntypetbl");
        wijntypes = q.list();
        System.out.println("WijntypeServices() einde" + wijntypes);
    }  
    
 public static Wijntypetbl Save(Wijntypetbl wijntype) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(wijntype);
        session.getTransaction().commit();
        session.close();
        return wijntype;
    }

    public static List<Wijntypetbl> GetAllWijntypes() {
        System.out.println("begin GetAllWijntypes");
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntypetbl");
        System.out.println("na query GetAllWijntypes");
        return q.list();

    }

    public static List<Wijntypetbl> GetAllWijntypes2(String qString) {
        System.out.println("begin GetAllWijntypes2 " + qString);

        Session session
                = HibernateUtil.getSessionFactory().openSession();

        Query q = session.createQuery(qString);
        System.out.println("na query GetAllWijntypes2 " + qString);
        return q.list();

    }

    public static Wijntypetbl getWijntype(int ID) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntypetbl wijn where wijntype.id=" + ID);
        return (Wijntypetbl) q.uniqueResult();
    }
}
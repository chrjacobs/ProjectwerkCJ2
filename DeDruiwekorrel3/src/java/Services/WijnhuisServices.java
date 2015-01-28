/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import DAL.Wijnhuistbl;
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
public class WijnhuisServices {

    // variabele --> in geheugen
    private List<Wijnhuistbl> wijnhuizen;

    public WijnhuisServices() {
        System.out.println("WijnhuisServices() begin");
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijnhuistbl");
        wijnhuizen = q.list();
        System.out.println("WijnhuisServices() einde" + wijnhuizen);
    }

    public List<Wijnhuistbl> getWijnhuis() {
        return wijnhuizen;
    }

    public static Wijnhuistbl Save(Wijnhuistbl wijnhuis) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(wijnhuis);
        session.getTransaction().commit();
        session.close();
        return wijnhuis;
    }

    public static List<Wijnhuistbl> GetAllWijnhuizen() {
        System.out.println("begin GetAllWijnhuizen");
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijnhuistbl");
        System.out.println("na query GetAllWijnhuizen");
        return q.list();

    }

    public static List<Wijnhuistbl> GetAllWijnhuizen2(String qString) {
        System.out.println("begin GetAllWijnhuizen2 " + qString);

        Session session
                = HibernateUtil.getSessionFactory().openSession();

        Query q = session.createQuery(qString);
        System.out.println("na query GetAllWijnhuizen2 " + qString);
        return q.list();

    }

    public static Wijnhuistbl getWijn(int ID) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijnhuistbl wijn where wijnhuis.id=" + ID);
        return (Wijnhuistbl) q.uniqueResult();
    }
}

package com.Assign3.IntroToHibernateAssign3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Project started" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        emp e = new emp();
        e.setId(1);
        e.setName("rahul");
        e.setDesc("cse");
        e.setSal(100);
Session session = factory.openSession();
Transaction tx = session.beginTransaction();
session.save(e);
tx.commit();
session.close();
System.out.println("done");
    }
}

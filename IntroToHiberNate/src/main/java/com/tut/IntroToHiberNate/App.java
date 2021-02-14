package com.tut.IntroToHiberNate;

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
        
        Emp e = new Emp();
        e.setEmpid(1);
        e.setEmpName("change");
        e.setDept("CSE");
        
        Emp e2 = new Emp();
        e2.setEmpid(2);
        e2.setEmpName("change2");
        e2.setDept("CSE");
    
        Session session  = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        session.save(e2);
        tx.commit();
        session.close();
        System.out.println("done");
    }
	

}

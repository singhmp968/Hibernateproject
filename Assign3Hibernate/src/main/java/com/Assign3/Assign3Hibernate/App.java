package com.Assign3.Assign3Hibernate;

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
        System.out.println(factory);
    employee e = new employee();
    //e.seteId(1);
    e.setEname("rahul");
    e.setDept("cse");
    e.setSal(120);
    
    employee e1 = new employee();
    //e1.seteId(2);
    e1.setEname("ra");
    e1.setDept("cse");
    e1.setSal(120);
    System.out.println(e1);
    
    employee e2 = new employee();
    //e1.seteId(2);
    e2.setEname("hul");
    e2.setDept("mech");
    e2.setSal(150);
    
    employee e3 = new employee();
    //e1.seteId(2);
    e3.setEname("lop");
    e3.setDept("ece");
    e3.setSal(1203);
       
    employee e4 = new employee();
    //e1.seteId(2);
    e4.setEname("ldsdsa");
    e4.setDept("cse");
    e4.setSal(170);
    Session session = factory.openSession();
    
  Transaction tx = session.beginTransaction();

  session.save(e);
  session.save(e1);
  session.save(e2);
  session.save(e3);
  session.save(e4);
  tx.commit();
    
    
   
    
    session.close();
    
    }
}

package com.Assign4;

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
    product e = new product();
    //e.seteId(1);
    e.setProductId(1);
    e.setProductName("soap");
    e.setPrice(100);
    product e2 = new product();
    //e.seteId(1);
    e2.setProductId(2);
    e2.setProductName("detergent");
    e2.setPrice(200);
    
    product e3 = new product();
    //e.seteId(1);
    e3.setProductId(3);
    e3.setProductName("pol");
    e3.setPrice(300);
    
    product e4 = new product();
    //e.seteId(1);
    e4.setProductId(4);
    e4.setProductName("laptop");
    e4.setPrice(500);   

    product e5 = new product();
    //e.seteId(1);
    e5.setProductId(5);
    e5.setProductName("gun");
    e5.setPrice(700);
    Session session = factory.openSession();
    
  Transaction tx = session.beginTransaction();

  session.save(e);
  session.save(e2);
  session.save(e3);
  session.save(e4);
  session.save(e5);
  tx.commit();
    
    
   
    
    session.close();
    

}
}

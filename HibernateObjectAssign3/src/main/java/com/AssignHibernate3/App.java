package com.AssignHibernate3;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Assign2.Flower;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println( "Project started" );
    	System.out.println("enter the flower id you need to update");
    	String Id = s.next();
    	System.out.println("Enter price");
     	int price = s.nextInt();
    
     	System.out.println("Enter Flower name");
     	String fname = s.next();
     	
     	System.out.println("Enter Flower color");
     	String fcolor = s.next();
     	
    	Flower f = new Flower();
    	f.setFlowerId(Id);
    	
    	f.setPrice(price);
    	f.setColor(fcolor);
    	f.setFlowerName(fname);
    	SessionFactory factory = new Configuration().configure().buildSessionFactory(); 

    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();
    session.update(f);
    tx.commit();
    session.close();
    
    Session s1 = factory.openSession();
    Flower f2 = (Flower)s1.load(Flower.class, Id);
    System.out.print(f.getFlowerId() + " " + f.getFlowerName() + " " + f.getColor() + " " + f.getPrice());
	session.close();
	factory.close();
    
    }
}

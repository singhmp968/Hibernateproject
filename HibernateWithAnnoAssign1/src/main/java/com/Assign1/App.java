package com.Assign1;

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
    	System.out.println("project is stared");
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       car_details cd = new car_details("caa152", "suv", "red", "hundai");
       car_details cd1 = new car_details("kl-07", "AB 123 polo", "white", "volkswagen");
       car_details cd2 = new car_details("kl-07", "AB 234 vento", "black", "volkswagen");
       car_details cd3 = new car_details("kl-07", "Ac 345 Corolla", "silver", "toyota");
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       session.save(cd);
       session.save(cd1);
       session.save(cd2);
       session.save(cd3);
       tx.commit();
       session.close();
       factory.close();
       
       
    
    }
}

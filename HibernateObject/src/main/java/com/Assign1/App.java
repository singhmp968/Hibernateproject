package com.Assign1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.Assign2.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();

    	Session session = factory.openSession();

    	Flower f = (Flower)session.load(Flower.class, "2");
    	System.out.print(f.getFlowerId() + " " + f.getFlowerName() + " " + f.getColor() + " " + f.getPrice());
    	session.close();
    	factory.close();
    }
}

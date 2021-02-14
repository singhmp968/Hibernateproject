package Assign2;

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
public static void main(String[] args) {
	

	System.out.println( "Project started" );
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Flower f = new Flower();
   f.setColor("yellow");
   f.setFlowerId("2");
   f.setFlowerName("marigold");
   f.setPrice(400);
   
        Session session  = factory.openSession();
    Transaction tx = session.beginTransaction();
    session.save(f);
    
    tx.commit();
    session.close();
    System.out.println("done");
}


}

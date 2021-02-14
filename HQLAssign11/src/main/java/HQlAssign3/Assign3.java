package HQlAssign3;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Assign1.car_details;

public class Assign3 {

	public static void main(String[] args) {
		
		System.out.println("Enter the reg no");
		Scanner s1=new Scanner(System.in);
		String regNo = s1.next();
		
		System.out.println("project is stared");
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    Session s = factory.openSession();

	    String query = "from car_details where RegNo=:x";
	    Query q=s.createQuery(query);
	    q.setParameter("x", regNo);

	    		List<car_details> list=q.list();
		
		for(car_details student : list) {
			System.out.println(student.getRefNo() + " : " + 
		student.getModel() + " : " +student.getColor()+ " : " + student.getManu());
		}
		
		s.close();
		factory.close();
		}
	
}

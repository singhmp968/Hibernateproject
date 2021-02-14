package com.Assign6;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Assign1.car_details;

public class Assign6 {

	public static void main(String[] args) {
		

		System.out.println("project is stared");
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    Session s = factory.openSession();

	    String query = "select count(regNo) from  car_details";
	    
	    Query q=s.createQuery(query);
		List<car_details> list=q.list();
		Long count = (Long)q.uniqueResult();
//		for(car_details student : list) {
//			System.out.println(student.getRefNo() + " : "  + student.getManu());
//		}
//		
	System.out.println(count);
		s.close();
		factory.close();
		}

	
	
}

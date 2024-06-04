package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetail;

public class DeleteDemo {
	public static void main(String[] args) {
		SessionFactory  factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.openSession();
		try {
			
				session.beginTransaction();
				int id=1;
				Instructor tempInstructor= session.get(Instructor.class, id);
				System.out.println("found instructor: "+tempInstructor);
				
				if(tempInstructor!= null) {
					System.out.println("Deleting: "+tempInstructor);
					session.delete(tempInstructor);
				}
				
				
				session.getTransaction().commit();
				System.out.println("Done! ");
		}finally {
			session.close();
			factory.close();
		}
}
}
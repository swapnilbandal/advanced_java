package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetail;

public class GetInstructorDetails {
	public static void main(String[] args) {
		SessionFactory  factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).buildSessionFactory();
		Session session = factory.openSession();
		try {
			//start transaction
			Instructor instructor = new Instructor("Pranav","Solunke","Pranav@gmail.com");
			InstructorDetail instructorDetail= new InstructorDetail("http://cggjs.fg","playing");
			
			instructor.setInstructorDetail(instructorDetail);
				session.beginTransaction();
				session.save(instructor);
				System.out.println(instructor);
				session.getTransaction().commit();
		}finally {
			session.close();
			factory.close();
		}
	}
}

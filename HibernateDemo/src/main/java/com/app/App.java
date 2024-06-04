package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=factory.openSession();
        
       
        session.beginTransaction();
        //Save Student
        Student s= new Student();
        s.setFirstname("swapnil");
        s.setLastName("bandal");
        s.setEmail("swapnilbandal211@gmail.com");
        s.setAge(22);
        session.save(s);
        //Get Student Record
       // int id=1;
       // Student s1= session.get(Student.class, id);
        //System.out.println(s1);
        
        //update
        //int id1=7;
        //Student s2= session.get(Student.class, id1);
        //s2.setFirstname("Pranav");
        
        //delete 
        //session.delete(s1);
        
        Query<Student> query = session.createQuery("from Student", Student.class);
        List<Student> studentList = query.getResultList();
        for (Student s2 : studentList) {
            System.out.println(s2);
        }
        
        
        session.getTransaction().commit();
        
    }
}

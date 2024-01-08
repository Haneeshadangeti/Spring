package com.learn.hibernate.Example.Project2_Student;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory SF=cfg.buildSessionFactory();
    	Session session=SF.openSession();
    	Transaction t=session.beginTransaction();
    	Student s=new Student(11,"Ajay",23);
    	session.save(s);
    	t.commit();
    	System.out.println("Row is inserted");
      
    }
}

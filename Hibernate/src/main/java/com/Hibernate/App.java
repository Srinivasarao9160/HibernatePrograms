package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ojas.Employee;



/**
 * Hello world!
 *
 */
public class App  
{
    public static void main( String[] args )
    {
        
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sf = cfg.buildSessionFactory();
       Session s = sf.openSession();
       Transaction tx = s.beginTransaction();
       Employee e = new Employee();
        e.setEno(101);
        e.setEname("sri");
        e.setSalary(3400);
        s.save(e);
        tx.commit();
        System.out.println(" sucessfully inserted");
        s.close();
        sf.close();
       
        
        
        
        
        
        
        
        
        
        
        
        
 
    }
}

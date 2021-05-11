package com.ojas.Hibernateven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import soluction.Student;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        Student stu = new Student();
        stu.setSid(1);
        stu.setSname("srinivas");
        stu.setScourse("java");
        ses.save(stu);
        ses.flush();
        t.commit();
        System.out.println("invoked succefly");
    }
}

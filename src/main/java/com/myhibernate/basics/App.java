package com.myhibernate.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory =cfg.buildSessionFactory();
        
        MyStudent stu =new MyStudent();
        stu.setName("Ankit");
        stu.setCity("Delhi");
        
        MyAddresss add =new MyAddresss();
        add.setStreet("Gandhi Nagar");
        add.setAddDate(new Date());
        add.setCity("Delhi");
        add.setIsOpen(true);
        add.setX(0);
        FileInputStream fis =new FileInputStream("src/main/java/webicon.png");
        byte[] data =new byte[fis.available()];
        fis.read(data);
        add.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(stu);
        session.save(add);
        
        MyStudent fetchStu = session.get(MyStudent.class,6);
        MyAddresss fetchAdd = session.get(MyAddresss.class, 3);
        
        System.out.println(fetchStu);
        System.out.println(fetchAdd.getCity());
        
        tx.commit();
        
        session.close();
//        System.out.println(stu);
//        System.out.println(add);
    }
}

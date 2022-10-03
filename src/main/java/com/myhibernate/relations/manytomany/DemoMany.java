package com.myhibernate.relations.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoMany {
	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg4.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		Session sec =factory.openSession();
		sec.beginTransaction();
		
		Event ev1 =new Event();
		ev1.setEventName("Event 1");
		Event ev2 =new Event();
		ev2.setEventName("Event 2");
		Event ev3 =new Event();
		ev3.setEventName("Event 3");
		Event ev4 =new Event();
		ev4.setEventName("Event 4");
		
		Delegate dg1 =new Delegate();
		dg1.setDelegateName("Delegate 1");
		Delegate dg2 =new Delegate();
		dg2.setDelegateName("Delegate 2");
		Delegate dg3 =new Delegate();
		dg3.setDelegateName("Delegate 3");
		Delegate dg4 =new Delegate();
		dg4.setDelegateName("Delegate 4");
		
		ev1.getDelegates().add(dg1);
		ev1.getDelegates().add(dg2);
		ev1.getDelegates().add(dg3);
		ev2.getDelegates().add(dg2);
		ev2.getDelegates().add(dg3);
		ev3.getDelegates().add(dg4);
		ev4.getDelegates().add(dg1);
		
		
		sec.save(dg1);
		sec.save(dg2);
		sec.save(dg3);
		sec.save(dg4);
		sec.save(ev1);
		sec.save(ev2);
		sec.save(ev3);
		sec.save(ev4);
		sec.getTransaction().commit();
		
		
		
	}

}

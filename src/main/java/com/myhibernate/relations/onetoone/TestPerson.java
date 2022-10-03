package com.myhibernate.relations.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPerson {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg2.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		Session sec =factory.openSession();
		sec.beginTransaction();
		
		PersonDetails pd =new PersonDetails();
		pd.setZipcode("452163");
		pd.setJob("Developer");
		pd.setIncome(2100000);
		
		Person p =new Person();
		p.setPersonName("Aman");
		p.setpDetails(pd);
		
		sec.save(p);
		sec.getTransaction().commit(); 

	}

}

package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Movie mobj=new Movie();
		mobj.setM_name("India Movies");
		mobj.setM_location("India");
		
		Movie_2d mt=new Movie_2d();
		mt.setCasting("Prabhas");
		mt.setM_name("Bahubali");
		
		Movie_8d md=new Movie_8d();
		md.setM_name("Bahubali");
		md.setDirector("Rajamouli");
		
		session.persist(mobj);
		session.persist(mt);
		session.persist(md);
		
		t.commit();
		System.out.println("Done.");
		session.close();
	}
}
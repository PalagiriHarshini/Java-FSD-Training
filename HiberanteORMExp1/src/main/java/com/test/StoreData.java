package com.test;


import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction ;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StoreData {
	public static void main(String args[]) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Employee emp=new Employee();
		
		emp.setEmp_name("Yuva");
		emp.setEmp_company("rcb");
		emp.setEmp_city("Blr");
		
		session.persist(emp);
		t.commit();
		Employee obj=session.find(Employee.class, 102);
		System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_company()+" "+obj.getEmp_city());
		obj.setEmp_company("Sharma");
		obj.setEmp_company("BCC");
		obj.setEmp_city("Blr");
		
		//session.persist(obj);
		//session.remove(obj);
	
		System.out.println("Done.");
		session.close();
		
	}

}

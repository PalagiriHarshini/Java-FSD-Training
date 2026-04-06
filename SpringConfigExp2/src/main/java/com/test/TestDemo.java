package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Employee obj=ctx.getBean("emp",Employee.class);
		System.out.println(obj);
	}
*/
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AnnConfig.class);
		Address adr=ctx.getBean("getAdrObj",Address.class);
		adr.setCity("Hyd");
		adr.setState("TG");
		
		Address adr2=ctx.getBean("getAdrObj",Address.class);
		adr.setCity("Mumbai");
		adr.setState("MH");
		
		List<Address> list=Arrays.asList(adr,adr2);
        Employee obj1=ctx.getBean("getAdrObj",Employee.class);
		
		obj1.setId(7);
		obj1.setName("Dhoni");
		obj1.setCompany("IPL");
		
		obj1.setAdr(list);
		System.out.println(obj1);
	}
	
}

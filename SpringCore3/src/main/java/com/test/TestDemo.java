package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestDemo {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Student obj=ctx.getBean("std",Student.class);
		System.out.println(obj);
		
		ExpressionParser exp= new SpelExpressionParser();
		Expression ex=exp.parseExpression("Simple Spring EL");
		String data=ex.getValue(String.class);
		
		System.out.println(data+" Literals");
		
	}

}

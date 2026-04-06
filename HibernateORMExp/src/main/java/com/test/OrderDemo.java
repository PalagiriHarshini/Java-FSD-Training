package com.test;

import java.util.List;

public class OrderDemo {
	public static void main(String[]args) {
		OrderDao odao=new OrderDao();
		Order obj=new Order();
		obj.setO_name("Books");
		obj.setO_price(50);
		obj.setO_quantity(5);
		
		//odao.saveOrder(obj);
		obj.setId(52);
		obj.setO_name("book");
		obj.setO_price(250);
		obj.setO_quantity(2);
		
		//odao.saveOrder(obj);
		//odao.UpdateOrder(obj);
		//odao.deleteOrder(obj);
		List<Order> list=odao.listAllOrders();
		
		list.forEach(dt -> System.out.println(dt.getId()+" "+dt.getO_name()+" "+dt.getO_price()+" "+dt.getO_quantity()));
	System.out.println("Done.");
	}

}

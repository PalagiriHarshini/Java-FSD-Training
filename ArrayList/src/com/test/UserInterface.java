package com.test;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		int choice=0;
		do {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter the product");
				String productt=sc.nextLine();
				p.addProduct(productt);
			}else if(choice==2) {
				if(p.getProduct().isEmpty()) {
					System.out.println("Empty");
				}else {
					p.sortProduct();
					for(String item:p.getProduct()) {
						System.out.println(item);
					}
				}
			}else if(choice==3) {
				System.out.println("Thank you for choosing");
			}else {
				System.out.println("Invalid choice");
			}
		}while(choice!=3);
		
	}

}

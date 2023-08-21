package com.tnsif.oops.encapsualtion;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Customer customer=new Customer();
		
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		
		System.out.println(" ");

		Customer c2=new Customer(name, id, city);
		System.out.println(c2);
		
		Customer c3=new Customer("Priya", 2, "Mumbai");
		System.out.println(c3);
	}
}

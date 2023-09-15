package com.tnsif.inheritance;

public class SingleLevelInheritanceDemo {

	public static void main(String[] args) {
		Student student = new Student("Gayatri", "Bangalore",  10, "FE",88.6f);
		System.out.println(student);
		
		Person p=new Person("Geeta","Mimbai");
		System.out.println(p);
		
		Person p1=new Person();
		System.out.println(p1); 
	}
}

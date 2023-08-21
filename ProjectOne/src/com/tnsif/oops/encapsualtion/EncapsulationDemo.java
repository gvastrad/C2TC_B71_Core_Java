package com.tnsif.oops.encapsualtion;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
	OOpsConceptDemo obj=new OOpsConceptDemo();
	obj.setSerialNo(1000);
	obj.setName("Pooja");
    obj.setAge(21);
    
	/*
	 * System.out.println(obj.getSerialNo()); System.out.println(obj.getName());
	 * System.out.println(obj.getAge());
	 */
    
   System.out.println(obj);
	}

}

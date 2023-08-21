package com.tnsif.packages.firstpackage;

public class Executor {
	public static void main(String[] args) {
		
		//accessing same package class
			Base b1=new Base();
			b1.methodDefault();
			b1.methodProtected();
			b1.methodPublic();
			
			b1.varDefault=11;
			b1.methodDefault();
			
			//private member can't accessible
			/*b1.varPrivate=21; 
			b1.methodPrivate();*/
			
			b1.varProtected=31;
			b1.methodProtected();
			
			b1.varPublic=41;
			b1.methodPublic();
			
}
}

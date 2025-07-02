package com.tnsif.day4.accessSpecifier.package2;

import com.tnsif.day4.accessSpecifier.parentackage.Base;

public class Executor extends Base{
	

	public static void main(String[] args) {
		
		Base b1 = new Base();
		
		b1.methodPublic();
		
		b1.varPublic=87;
		b1.methodPublic();
		
		
		// Accessing protected method using subclass
		Executor executor =new Executor();
		executor.methodProtected();
		executor.varProtected=7878;
		executor.methodProtected();
	
	}

}

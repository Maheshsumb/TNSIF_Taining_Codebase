package com.tnsif.day4.accessSpecifier.parentackage;



public class Base {

	// Variables 
	int varDefault=10;
	public int  varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault() {
		System.out.println("Default access base cLass");
		System.out.println("Default Variable: "+varDefault);
	}
	public void methodPublic() {
		System.out.println("Public access base cLass");
		System.out.println("Public Variable: "+varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("Private access base cLass");
		System.out.println("Private Variable: "+varPrivate);
	}
	protected void  methodProtected() {
		System.out.println("Protected access base cLass");
		System.out.println("Protected Variable: "+varProtected);
	}
	
	
	
}

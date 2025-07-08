package com.tnsif.day8.nestedinterface;

public class NastedDemo  implements OuterInterface, OuterInterface.innerInterface{

	@Override
	public void greet() {
		System.out.println("Hello from inner interface");
		
	}

	@Override
	public void show() {
		System.out.println("Hii from outer interface");
		
	}

}

package com.tnsif.day6.staticmethod;

public class StaticMain {
	public static void main(String[] args) {

		StaticDemo.display();
		
		System.out.println();
		
		StaticDemo sDemo=new StaticDemo();
		System.out.println(sDemo);
		
		StaticDemo.display();
		System.out.println();
		StaticDemo sDemo2=new StaticDemo();
		
		System.out.println(sDemo2);
	}
}

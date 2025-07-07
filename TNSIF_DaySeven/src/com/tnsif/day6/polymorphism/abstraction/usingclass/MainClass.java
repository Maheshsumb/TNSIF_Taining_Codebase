package com.tnsif.day6.polymorphism.abstraction.usingclass;

public class MainClass {

	public static void main(String[] args) {
		Shape shape;
		
		shape=new Square(2f);
		shape.calArea();
		shape.show();
		shape=new Rectangle(2, 5);
		shape.calArea();
		shape.show();
		shape=new Circle(3);
		shape.calArea();
		shape.show();
		
	}
}

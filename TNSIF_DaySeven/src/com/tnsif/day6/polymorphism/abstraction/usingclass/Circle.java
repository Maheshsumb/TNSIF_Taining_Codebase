package com.tnsif.day6.polymorphism.abstraction.usingclass;

public class Circle extends Shape{
	public float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public void calArea() {
		
		this.area=3.14f*radius*radius;
		
	}
	

}

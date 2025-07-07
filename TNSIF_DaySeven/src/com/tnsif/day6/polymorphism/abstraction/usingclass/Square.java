package com.tnsif.day6.polymorphism.abstraction.usingclass;

public class Square  extends Shape{

	public float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	
	@Override
	public void calArea() {
		this.area=side*side;
	}
}

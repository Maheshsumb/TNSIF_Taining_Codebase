package com.tnsif.day6.polymorphism.abstraction.usingclass;

public class Rectangle extends Shape{
	
float width;
float length;
public Rectangle(float width, float length) {
	super();
	this.width = width;
	this.length = length;
}

@Override
	public void calArea() {
		this.area=width*length;	
	}

}

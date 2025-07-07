package com.tnsif.day6.polymorphism.abstraction.usingclass;

public abstract class Shape {

	protected float area;
	
	public void show() {
		System.out.println("Area is "+ area);
	}
	public abstract void calArea();
}

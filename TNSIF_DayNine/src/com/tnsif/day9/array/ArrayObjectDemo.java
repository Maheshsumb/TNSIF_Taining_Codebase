package com.tnsif.day9.array;

public class ArrayObjectDemo {

	
	public static void main(String[] args) {
		
		Student[] arr;
		
		arr=new Student[5];
		
		arr[0]=new Student(101,"Mahesh");
		arr[1]=new Student(102,"Sahil");
		arr[2]=new Student(103,"Rajesh");
		arr[3]=new Student(104,"Datta");
		arr[4]=new Student(105,"Aayan");
		
		for (Student student : arr) {
			System.out.println(student);
		}
	}
}

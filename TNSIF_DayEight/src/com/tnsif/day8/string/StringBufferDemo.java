package com.tnsif.day8.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer buffer= new StringBuffer("Hello");
		System.out.println(buffer);
		
		// Length
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		String s;
		int a=42;
		
		buffer =new StringBuffer(40);
		
		s=buffer.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		buffer=new StringBuffer("I java");
		
		buffer.insert(2, "like ");
		System.out.println(buffer);
		buffer.delete(2, 6);
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		buffer.reverse();
		System.out.println(buffer.indexOf("a"));
		
	}
}

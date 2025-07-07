package com.tnsif.day6.polymorphism.overloading;

// Method Overloading
public class Method {

	public static void Area(int a) {
		System.out.println("Area Of Square: " + a * a);
	}

	public static void Area(int a, int b) {
		System.out.println("Area of Rectangle: " + a * b);
	}

	public static void main(String[] args) {
		Area(3);
		Area(4, 5);
System.out.println(str());
	}

	public static boolean str() {

		String s = "0mp :m";
		s = s.toLowerCase();
		String ns = String.join("", s.split("[^a-z0-9]"));
		System.out.println(ns);
		int j = ns.length()-1;
		for (int i = 0; i < ns.length(); i++) {
			if (ns.charAt(i) != ns.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;

	}
}

package com.tnsif.day6.staticmethod;

public class StaticDemo {
	
	private int section;	// Non static member
	private static int srNo;  	// Static Member

	static {
		System.out.println("_________________ Whithin static block _________________");
		srNo=253;
//		section=83778;		Cannot make a static reference to the non-static field section
	}

	
	public StaticDemo(int section) {
		this.section = section;
	}


	public StaticDemo() {
		System.out.println("-------------------------- Whithin default constructor ------------------------");
		srNo++;
		section++;
	}


	@Override
	public String toString() {
		return "StaticDemo [Serial No="+srNo+", section=" + section + "]";
	}
	
	static void display() {
//		System.out.println("Section "+ section);		Cannot make a static reference to the non-static field section
		System.out.println("---------------------Display Method---------------------");
		System.out.println("Serial No: "+srNo);
	}
	
	
	
}

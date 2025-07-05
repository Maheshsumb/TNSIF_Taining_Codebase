package com.tnsif.day6.finalkeyword;

public class FinalVaribles {
//	final int a; 	The blank final field x may not have been initialized must be initialized not only declared

	final int x = 100;

//	declare static blank  final variable
	final static int y; // The blank final field x may not have been initialized must be initialized not
						// only declared
	final static int z = 90;

	void change() {

		/*
		 * x=30; z=70;	The final field FinalVaribles cannot be reassigned
		 * y=099; 
		 */
		
	}

	@Override
	public String toString() {
		return "FinalVaribles [x=" + x + ", y= " + y +", z= "+z +" ]";
	}
	
	static {
		y=20;
//		z=0; The final field FinalVaribles cannot be reassigned
	}

}

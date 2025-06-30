package com.tnsif.dayone;
import java.text.DecimalFormat;
import java.text.Format;
public class DataTypesExample {

	public static void main(String[] args) {
	
		
		// Data Types Examples 
		 
		
//		Integer Data types
		byte b=2;   		// Byte Size: 1 byte
		short s=4;			// Short Size: 2 byte
		int a=10;			//Int Size: 4 byte
		long l=223456789l;	// long size: 8 byte
		
		
		// Decimal DataTypes
		
		float f=23f;
		
		double d=45.44d;
		
//		System.out.println(f);
		
		
		// Character Data types
		
		char c='a';
		
		
		char ch=65;
//		System.out.println(c+"\t"+ch);
		
		
		//  Boolean  Data type
		
		boolean bo=true;
//		System.out.println(bo);
		
		
		// Ranges of Datatypes
		
//		1 byte = 8 Bit
		float mF=3232.14124327834545f;
		
		
		System.out.println("<----- Ranges of datatypes----->");
		System.out.println("Byte MinValue "+Byte.MIN_VALUE+" Max Value "+Byte.MAX_VALUE);
		System.out.println("Short MinValue "+Short.MIN_VALUE+" Max Value "+Short.MAX_VALUE);

//		System.out.println("Int MinValue "+Integer.MIN_VALUE+" Max Value "+Integer.MAX_VALUE);

		System.out.println("Long MinValue "+Long.MIN_VALUE+" Max Value "+Long.MAX_VALUE);
		
		
		DecimalFormat df = new DecimalFormat("0.###############################");
		System.out.println("Float MinValue "+df.format(Float.MIN_VALUE)+" Max Value "+df.format(Float.MAX_VALUE));
		System.out.println("Double MinValue "+df.format(Double.MIN_VALUE)+" Max Value "+df.format(Double.MAX_VALUE));

/*
<----- Ranges of datatypes----->
Byte MinValue -128 Max Value 127
Short MinValue -32768 Max Value 32767
Long MinValue -9223372036854775808 Max Value 9223372036854775807
Float MinValue 0 Max Value 340282346638528860000000000000000000000
Double MinValue 0 Max Value 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

  
*/

	
				

	}

}

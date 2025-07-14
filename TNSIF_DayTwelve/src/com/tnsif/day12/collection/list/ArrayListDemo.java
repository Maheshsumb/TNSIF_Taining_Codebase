package com.tnsif.day12.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List lst = new ArrayList();
		
		System.out.println(lst.isEmpty());
		
		lst.add(10);
		lst.add("Mahi");
		lst.add(20);
		lst.add(true);
		lst.add(20.55f);
		lst.add(23);
		lst.add(20);
		
		System.out.println("List is : "+lst);
		
		System.out.println("List is empty: "+lst.isEmpty());
		System.out.println("List size :"+lst.size());
		System.out.println(lst.contains(20));
		
		lst.remove(true);
		System.out.println("List is : "+lst);
		lst.remove(4);
		System.out.println("List is : "+lst);
		
		
		System.out.println(lst.remove(lst.remove(lst.lastIndexOf(20))));
		System.out.println("List is : "+lst);
		System.out.println("ibdex of 20 : "+lst.indexOf(20));
		
		
		
		lst.clear();

		
		// Generic 
		
		List <String>list=new ArrayList<String>();
		list.add("Jjb");
//		list.add(null);
//		list.add(3);		String generic integer not allowed
		
		list.remove(0);
		
		list.add("Mahesh");
		list.add("Sahil");
		list.add("Rajesh");
		list.add("Datta");
		list.add("Aayan");
		
		System.out.println("List is "+list);
		Collections.reverse(list);
		System.out.println("List is "+list);
		
		System.out.println(list.contains("Mahesh"));
		
		Collections.sort(list);
		System.out.println("List is "+list);
		
		Iterator<String> i=list.iterator();
		
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		ListIterator<String> li = list.listIterator(list.size());
		
		while (li.hasPrevious()) {
			System.out.println(li.previous());
			
		}
		
		System.out.println("\n\n\n");
		
		int num=1010;
		int d=0;
		int j=0;
		
		while(num!=0) {

//			System.out.println("Num, d,j, num%10 (int)Math.pow((num%10)  "+num+" "+d+" "+j+" "+num%10+ " "+ (int)Math.pow((num%10),j));
			d+=(int)Math.pow(2, j);

			j++;
			num/=10;
		}
		System.out.println(d);
		
		
		
		

		
	}
}

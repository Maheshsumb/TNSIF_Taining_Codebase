package com.tnsif.day12.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ExDequeDemo {
	
	public static void main(String[] args) {
		
		Deque<Integer> dQueue=new  ArrayDeque<Integer>();
		
		
		for (int i = 1; i <= 10; i++) {
			dQueue.add(i*2);
		}
		System.out.println(dQueue);
	
		
		
		dQueue.pollLast();
		System.out.println(dQueue);
		
		dQueue.pollFirst();
		System.out.println(dQueue);
		
		for(int i : dQueue)
		{
			System.out.println("queue is :"+ i);
		}
		
		System.out.println(dQueue);
		

		
		
		
		
		
	}

}

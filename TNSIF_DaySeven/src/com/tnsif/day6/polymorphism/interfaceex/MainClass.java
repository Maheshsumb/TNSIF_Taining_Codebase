package com.tnsif.day6.polymorphism.interfaceex;

public class MainClass {
	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("Sahil", "Pune", 2133164, 560000);
		s1.deposite(10000);
		System.out.println(s1);
		s1.withdraw(5600);
		System.out.println(s1);
		s1.deposite(266666);
		s1.withdraw(5665644);
	}
}

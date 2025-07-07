package com.tnsif.day6.polymorphism.interfaceex;

public class SavingAccount extends Customer implements Bank{

	private int accNo;
	private float balance;
	
	
	
	public SavingAccount() {
		
	}

	public SavingAccount(String cName, String cCity,int accNo, float balance) {
		super(cName, cCity);
		this.accNo = accNo;
		this.balance = balance;
	}
	@Override
	public void deposite(float amount) {
		
		if(amount<0 || amount>DepositeLimit) {
			System.err.println("Please enter valid amount !!!!!!!!!!");
		}
		else {
			balance+=amount;
			System.out.println("Rs : "+amount+ " is deposited succesfully....");
		}
	}

	@Override
	public void withdraw(float amount) {
		if (amount<=balance-MiniBal) {
			balance-=amount;
			System.out.println("Rs : "+amount+ " is Withdraw succesfully....");
		}
		
		else {
			System.err.println("Insuffiecient Balance !!!!!");
		}
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getcName()=" + getcName() + ", getcCity()="
				+ getcCity() + "]";
	}
	
	

}

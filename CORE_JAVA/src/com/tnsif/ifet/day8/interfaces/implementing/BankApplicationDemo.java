package com.tnsif.ifet.day8.interfaces.implementing;

public class BankApplicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Bank instance
	     Bank bank = new BankImp();

	     // Create an Account
	     Account account = new Account(7046, "DHEENA", 18490, bank);

	     // Deposit money
	     account.deposit(2000);
	     System.out.println(account);
	     
	     // Withdraw money
	     account.withdraw(10000);
	     System.out.println(account);
	}

}

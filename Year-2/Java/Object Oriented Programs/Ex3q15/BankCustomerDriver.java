/*
@author DH         
Date: November '15
Purpose:

Create a class BankCustomer. Each BankCustomer has a name, address and can have up to three 
SavingsAccounts. The BankCustomer constructor method should only accept the name and address 
of the customer. Provide a method called addAccount that accepts one SavingsAccount parameter 
– the BankCustomer object should keep track of how many valid SavingsAccounts have been added 
so far. Provide a method called balance that computes and returns the BankCustomers total 
savings. Provide a method summary that prints each account number and corresponding balance.

Create a driver program that fully tests all of the above methods.
*/

public class BankCustomerDriver {

	public static void main(String[] args) {

		
		
	    //Create objects
		BankCustomer customer1 = new BankCustomer("Dan","12 MPC NEWBRIDGE");
		BankCustomer customer2 = new BankCustomer("Tom","15 LAKESIDE PARK");

	    SavingsAccount.setAnnualInterestRate(0.04);
		
		
		SavingsAccount savings1 = new SavingsAccount(2000.0);
		SavingsAccount savings2 = new SavingsAccount(5000.0);
		SavingsAccount savings3 = new SavingsAccount(3000.0);
		
		customer1.addAccount(savings1);   // Add each Account to the Accounts Array
		customer1.addAccount(savings2);
		customer1.addAccount(savings3);


	    System.out.println(customer1.toString());

		SavingsAccount savings4 = new SavingsAccount(2000.0);
		SavingsAccount savings5 = new SavingsAccount(5000.0);
		SavingsAccount savings6 = new SavingsAccount(3000.0);
	    
	    customer2.addAccount(savings4);//Will go setup and store in account 1
	    customer2.addAccount(savings5);//Will go setup and store in account 2
	    customer2.addAccount(savings6);//Will go setup and store in account 3

	    System.out.println(customer2.toString());
	}

}

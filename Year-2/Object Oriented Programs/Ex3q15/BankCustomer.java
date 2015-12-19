
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

import java.util.Arrays;

public class BankCustomer {
	
	private String name;
	private String address;
	private SavingsAccount[] savings = new SavingsAccount[3]; // We create an array for the SavingsAccount objects (3)
	private int noOfAccounts=0;

	public BankCustomer(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addAccount(SavingsAccount acccount) {//pass in the object from the driver, can name this var anything

		if(noOfAccounts<3){
			savings[noOfAccounts] = acccount;//put object into the array 		
			noOfAccounts++;	
		}
		else{
			System.out.print("Max number of accounts reached");
		}	
	}

	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", address=" + address + ", account=" + Arrays.toString(savings);
	}

}

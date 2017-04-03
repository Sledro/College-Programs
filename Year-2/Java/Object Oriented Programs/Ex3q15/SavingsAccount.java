/**
** Author: DH         Date: November '15
**
** Description: Create a class SavingsAccount. Each SavingsAccount should have a unique number 
*that is automatically assigned by the constructor method, i.e. the number is not to be passed 
*as a parameter to the constructor. The account numbers should start at 1 and count upwards in 
increments of 1.
Use a static class variable to store the annualInterestRate for each of the savers. Each object 
of the class contains a private instance variable savingsBalance indicating the amount the 
saver currently has on deposit. Provide method calculateMonthlyInterest() to calculate the 
monthly interest by multiplying  the balance by annualInterestRate divided by 12; this interest 
should be added to savingsBalance. Provide a static method modifyInterestRate() that sets the 
annualInterestRate to a new value. 

Driver program

Write a driver program to test class SavingsAccount. Instantiate two different savingsAccount 
objects, saver1 and saver2, with balances of €2000.00 and €3000.00, respectively. Set 
annualInterestRate to 4%, then calculate the monthly interest and print the new balances for 
each of the savers. Then set the annualInterestRate to 5% and calculate the next month's 
interest and print the new balances for each of the savers.
*/



public class SavingsAccount {
	// A static variable is one that's associated with a class, not objects of that class. 
	public static double annualInterestRate;
	// A static counter to count the number of SavingAccount objects created to assign ID's
	private static int count;
	
	private int accountNo;
	private double savingsBalance;
	
	
	/**
	 * @param accountNo
	 * @param savingsBalance
	 */
	public SavingsAccount(double savingsBalance) {
		count = count + 1;
		this.accountNo = count;
		this.savingsBalance = savingsBalance;
	}


	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		SavingsAccount.count = count;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	@Override
	public String toString() {
		return "SavingsAccount [accountNo=" + accountNo + ", savingsBalance=" + savingsBalance + "]";
	}
	
	

}
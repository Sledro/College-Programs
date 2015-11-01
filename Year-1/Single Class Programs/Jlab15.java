class Jlab15

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Enter a loan amount, the interest rate per annum and the amount of years the loan is to be taken out for. 
//						The program should then calculate and print out the total amount repaid.

 
{
    public static void main(String[] args)
	{

	    double loanAmount; 
		double intrestAnnum;  
		double yearsTaken;		
		double totalIntrest;
		double totalRepaid;
		
		System.out.print("Enter the loan amount ->  "); 
		loanAmount = EasyIn.getDouble(); 
	    
		System.out.print("Enter the intrest per annum ->  "); 
		intrestAnnum = EasyIn.getDouble(); 
			 	    
		System.out.print("Enter the years taken to repay ->  "); 
		yearsTaken = EasyIn.getDouble(); 
		
		totalIntrest = loanAmount / 100 * intrestAnnum * yearsTaken;
		totalRepaid = loanAmount + totalIntrest;				
	    		 
	    System.out.println("The total amout to be repaid is " + totalRepaid); 

	}
}


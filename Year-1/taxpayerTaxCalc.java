class taxpayerTaxCalc 

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			A tax calculation program.


 
{
    public static void main(String[] args)
	{

	    double annualIncome; 
		int numChildren;  
		double taxPaid; 
		double childAllowance; 
	    		
		System.out.print("Enter your total annual income ->  "); 
		annualIncome = EasyIn.getDouble(); 
		System.out.print("Enter you number of children ->  "); 
		numChildren = EasyIn.getInt(); 
		
		childAllowance = numChildren * 1000; 
		taxPaid = (annualIncome / 100) * 24 - (5000 + childAllowance);
		
	    System.out.println("Your tax paid is: " + taxPaid); 
	  
	}
}

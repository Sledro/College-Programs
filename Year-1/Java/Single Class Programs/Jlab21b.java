class Jlab2b1

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				01/10/14
// Purpose : 			Write a program which calculates the insurance premium for the coming year. The program asks the user for the value of last year's 
//						premium and the number of claims you made in the year. The basic premium for the following year  will be a 5% increase on last years premium. 
//						If the person made no claims they get a 40% discount on this increase. If they made a claim the get an extra charge of 20% for every claim that they made.
////////////////

 
{
    public static void main(String[] args)
	{

	    double lastYearPremium;
	    double numOfClaims;
	    
	    double increase;
	    double basicPremium;
	    
	    double discount;
	    double newPremium;
	    
	    double extraCharge;
	   
	    					    		
		System.out.print("Enter last years Premium ->  "); 
		lastYearPremium = EasyIn.getDouble(); 
		
		System.out.print("Enter the number of times you claimed last year ->  "); 
		numOfClaims = EasyIn.getInt(); 
			
		////Calc
		increase = (lastYearPremium / 100) * 5;
		basicPremium = lastYearPremium + increase;
				
		
		if (numOfClaims == 0)
		{
			
			discount = (increase / 100) * 40;				
			newPremium = basicPremium - discount;
								
			System.out.println("  New Basic Premium  " + basicPremium); 
			System.out.println("  Minus Discount ->  " + discount);
			System.out.println("  New Premium ->  " + newPremium); 	
		}	
		
		else if (numOfClaims > 0)
		{
				
		   extraCharge = numOfClaims * 20;
		   extraCharge = (basicPremium / 100) * extraCharge;
		   newPremium = extraCharge + basicPremium;
		   
		   System.out.println("  New Premium ->  " + newPremium); 
		   
		}		

			
		
	}
}

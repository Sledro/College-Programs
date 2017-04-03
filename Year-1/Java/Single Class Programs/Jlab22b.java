class Jlab2b2

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				03/10/14
// Purpose : 			2.	Write a program to calculate credit card interest. Interest is charged at 12% for the first €500 and at 18% for any remaining amount over €500. 
////////////////

 
{
    public static void main(String[] args)
	{

	    double creditAmount;
		double payBack;	
		double intrest;	      
	    					    		
		System.out.print("Enter the amout of credit ->  "); 
		creditAmount = EasyIn.getDouble(); 
				
	
		
		if (creditAmount <= 500)
		{
			
			intrest = (creditAmount / 100) * 12;				
			payBack = creditAmount + intrest;
								
			System.out.println("  Your intrest is ->  " + intrest); 	
			System.out.println("  Your amout to pay back is ->  " + payBack); 
		}	
		
		else if (creditAmount >= 500)
		{
				
			intrest = (creditAmount / 100) * 18;				
			payBack = creditAmount + intrest;
								
			System.out.println("  Your intrest is ->  " + intrest); 	
			System.out.println("  Your amout to pay back is ->  " + payBack); 
		   
		}		

		
		
	}
}

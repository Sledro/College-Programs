class Jlab32 

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			2)	Write a program that will find the sum of a collection of data values. Your program should terminate when a zero value is read.


 
{
    public static void main(String[] args)
	{

		int num1; 
		int sum=0;
	
	    
	    

		System.out.println("Enter 1 to begin calculator. \n"); 
	    System.out.println("Enter 0 to exit at anytime. \n"); 
	    num1 = EasyIn.getInt();
		
		if (num1 == 0)
		{
			
		}
		else
		{
	    
		    while (num1 != 0) 
			{		
				System.out.print("\nEnter a number to add to the sum total. -> "); 
				num1 = EasyIn.getInt();
				
				sum = sum + num1;
				
				System.out.println("\nThe current total is -> " + sum); 
		
				
		    }
	    }
	  
	}
}

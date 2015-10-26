class Jlab2b3

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				03/10/14
// Purpose : 		3.	Write a program which asks the user to enter 3 different numbers. The program then tells the user which number was the lowest number entered.
////////////////

 
{
    public static void main(String[] args)
	{

		int num1;
		int num2;
		int num3;     
	    					    		
		System.out.print("Enter the first number ->  "); 
		num1 = EasyIn.getInt(); 
		
		System.out.print("Enter the second number ->  "); 
		num2 = EasyIn.getInt(); 
		
		System.out.print("Enter the third number ->  "); 
		num3 = EasyIn.getInt(); 
				
	
		
		if (num1 < num2 && num1 < num3)
		{
			 	
			System.out.println("  The lowest number you entered is ->  " + num1); 
		}	
		else if (num2 < num1 && num2 < num3)
		{
			 	
			System.out.println("  The lowest number you entered is ->  " + num2); 
		}				
		else if (num3 < num1 && num3 < num2)
		{
			 	
			System.out.println("  The lowest number you entered is ->  " + num3); 
		}
		
		
	}
}

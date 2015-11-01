class Jlab24

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Write a program which ask the user for 2 numbers, it then indicates whether the first number is exactly divisible by the second number.

 
{
    public static void main(String[] args)
	{

	    int num1;
	    int num2;
					    		
		System.out.print("Enter the first number number ->  "); 
		num1 = EasyIn.getInt(); 
		
		System.out.print("Enter the second number number ->  "); 
		num2 = EasyIn.getInt(); 
		
				
		if ( num1 % num2 == 0 )
		{
			System.out.println("Yes"); 
		}
		else
		{
			System.out.println("No");
		}
				
		
	}
}

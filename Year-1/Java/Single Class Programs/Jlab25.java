class Jlab25

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Write a program which ask the user for 2 numbers, it then indicates whether the first number is The first number is exactly divisible by both numbers..
////// start on 25 part 2

 
{
    public static void main(String[] args)
	{

	    int num1;
	    int num2;
	    int num3;
	    					    		
		System.out.print("Enter number One ->  "); 
		num1 = EasyIn.getInt(); 
		
		System.out.print("Enter number Two ->  "); 
		num2 = EasyIn.getInt(); 

		System.out.print("Enter number Three ->  "); 
		num3 = EasyIn.getInt(); 
				
				
		if ( num1 % num2 == 0 && num1 % num3 == 0 )
		{
			System.out.println("Number One is exactly divisible by number Two and Three"); 
		}
		else
		{
			System.out.println("Number One is NOT exactly divisible by number Two and Three");
		}
				
		
	}
}

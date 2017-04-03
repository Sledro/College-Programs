class Jlab23

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Write a program which determines whether a number is odd or even

 
{
    public static void main(String[] args)
	{

	    int num1;
					    		
		System.out.print("Enter a number ->  "); 
		num1 = EasyIn.getInt(); 
		
				
		if ( num1 % 2 == 0 )
		{
			System.out.println("You entered an even number!"); 
		}
		else
		{
			System.out.println("You entered an odd number!");
		}
				
		
	}
}

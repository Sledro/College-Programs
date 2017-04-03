class Jlab21

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Write a program in which the user enters an integer value. Depending on the input the program will output whether the number was 
//                      greater than zero, less than zero or equal to zero.

 
{
    public static void main(String[] args)
	{

	    int number; 
					    		
		System.out.print("Enter the first number ->  "); 
		number = EasyIn.getInt(); 
		
		if (number > 0)
		{
			System.out.println( number + " Is greater then 0."); 
		}
		else if (number < 0)
		{
			System.out.println( number + " Is less then 0."); 
		}
		else
		{
			System.out.println( number + " Is equal to 0."); 
		}		    

	}
}

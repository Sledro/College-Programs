class Jlab62

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/12/14
// Purpose : Write a method award() that takes a mark as its argument and returns as its result a String containing the values of either 
//           “Distinction”, “Merit1”, “Merit2”, “Pass” or “Fail” where these are calculated as follows
{
	
    public static void main(String[] args)// Main method
    {
		double mark; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a mark and ill tell you your result. \n\n");
		mark = EasyIn.getDouble();
		
		award(mark);                                  
    }
    
    // returns the number of alphabetic characters in that string
	public static void award(double mark)
	{					   	
		
		if ( mark >= 0 && mark <= 39 )
		{
			System.out.println("Sorry, You failed !"); 
		}
		else if (mark >= 40 && mark <= 53)
		{
			System.out.println("Well Done, you got a pass!"); 
		}
		else if (mark >= 54 && mark <= 62)
		{
			System.out.println("Well Done, you got a merit 2!"); 
		}		    
		else if (mark >= 63 && mark <= 69)
		{
			System.out.println("Well Done, you got a merit 1!"); 
		}	
		else if (mark >= 70 && mark <= 100)
		{
			System.out.println("Well Done, you got a distinction :D !!!"); 
		}
		else
		{
			System.out.println("Error: There was an error.");
		}
		
       
	}
}

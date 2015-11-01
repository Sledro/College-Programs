class Jlab61

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				12/12/14
// Purpose : Write a method called isEven() that takes an integer as its argument and returns true if the argument is an even number otherwise it returns false. 
{
	
    public static void main(String[] args)// Main method
    {
		int number=0; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a number and I will tell you if its even or odd. \n\n");
		number = EasyIn.getInt();
		
		isEven(number);                                  
    }
    
    // Check if argument is an even or odd number.
	public static void isEven(int number)
	{
        if(number % 2 == 0) 
        {
            System.out.println("True");
        }
        else
        {
        	System.out.println("False");	
        }  
        
	}
}

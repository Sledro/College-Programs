class Jlab76

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				18/02/15
// Purpose :	6)	Write a program that reads in an array of strings and lists each string on a separate line in output telling you if it is a palindrome or not 

{   

    // Void method to fill the array 
	public static void fillArray(String stringArray[])
	{    
		int index;

		for (index = 0; index <= stringArray.length-1; index ++)
    		{
    			System.out.print("\nEnter string " + (index + 1) + " : "); 
				stringArray[index] = EasyIn.getString();	
    		}
	}

	// Return medthod to take in the array and output the reverse.
	public static String reverse(String currString)
	{   	
    	int i;
    	String reversed="";
    	
		for ( i = currString.length()-1; i >= 0; i--) 
			{
	   			reversed = reversed + currString.charAt(i); 
	   			
			}
				
		return reversed;
	}
	
	
    // Void method to compare two strings
	public static void compareStrings(String stringArray[])
	{    
		int index;
		int countPallys=0;

		for (index = 0; index <= stringArray.length-1; index ++)
    		{
    			
    			if( (stringArray[index]).equals(reverse(stringArray[index])) )
    				{
						System.out.println("\n" + stringArray[index] + " is a palindrome!");  
						countPallys++;	
					}
					else
					{
						System.out.println("\n" + stringArray[index] + " is NOT a palindrome!");  
					}	
    		}
    		
		System.out.println("\nYou enterd a total of [" + countPallys + "] palindromes in your array!");  
	}	
		
	public static void listNames(String stringArray[])
	{
		for (int index = 0; index < stringArray.length; index ++)
	    		{
	    			System.out.println(stringArray[index]);	
	    		}
	    		
	   	
	}

				
	// Main method
    public static void main(String[] args)
    {		
    	
   		String stringArray[];
    	int stringSize;
	    
    	System.out.print("\nPlease enter the amout of strings you need to enter: "); 
		stringSize = EasyIn.getInt();
		
		stringArray = new String[stringSize]; // SET charArray[numOfChars]
		fillArray(stringArray); // PASS the array strcture to be filled by user

		listNames(stringArray);  	
    }

}

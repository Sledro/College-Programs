class Jlab75

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				18/02/15
// Purpose :		5)	Write a program that reads in an array of alphabetic characters and tells you if this array of characters is a palindrome or not. 
//						What is the main difference in terms of implementation between this program and your last project?

{   


    // Void method to fill the array 
	public static void fillArray(char charArray[])
	{    
		int index;

		for (index = 0; index <= charArray.length-1; index ++)
    		{

    			System.out.print("\nEnter charater " + (index + 1) + " : "); 
				charArray[index] = EasyIn.getChar();
				
				//Debug - View array input positions System.out.println("\nCharater [" + charArray[index] + "] has been stored at position [" + (index) + "] of the array!"); 
    		}
	}

	
	// Return medthod to take in the array and output the reverse.
	public static String reversedArray(char charArray[])
	{   	
		String charToString = new String(charArray);

    	int i;
    	String reversed="";
    	
		for ( i = charArray.length-1; i >= 0; i--) 
			{
	   			reversed = reversed + charToString.charAt(i); 
	   			
			}
				
		return reversed;
	}
	
	
	// Return medthod to take in the array and output the forward (Normal String).
	public static String forwardArray(char charArray[])
	{   	
		String charToString = new String(charArray);

    	int i;
    	String forward="";
    	
		for ( i = 0; i <= charArray.length-1; i++) 
			{
	   			forward = forward + charToString.charAt(i); 
	   			
			}
			
		return forward;
	}


	// Return medthod to compare both strings that were created from the array.
	public static void compareStrings(char charArray[])
	{   	
		if ( (reversedArray(charArray)).equals(forwardArray(charArray)) ) // == tests object references, .equals() tests the string values. 
		{
			System.out.println("\nThe array you entered is a valid palindrome!");  
		}
		else
		{
			System.out.println("\nThe array you entered is NOT a palindrome! || [" + reversedArray(charArray) + "] is not equal to [" + forwardArray(charArray) + "]");  
		}
	}	
		
				
	// Main method
    public static void main(String[] args)
    {		
    	
   		char charArray[];
    	int charInput;
	    
    	System.out.print("\nPlease enter the amout of charaters you need to enter: "); 
		charInput = EasyIn.getInt();
		
		charArray = new char[charInput]; // SET charArray[numOfChars]
		fillArray(charArray); // PASS the array strcture to be filled by user

			
		System.out.println("\nYour array reversed is [" + reversedArray(charArray) + "] ");  
		System.out.println("\nYour array forward is [" + forwardArray(charArray) + "] "); 
			
		compareStrings(charArray);	
			
    }

}

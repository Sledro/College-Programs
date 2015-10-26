class Jlab66

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/12/14
// Purpose : Rewrite each of the programs in lab sheet 4 using methods where the method takes a string as its argument and returns the appropriate value. 
//           Come up with your own names for your methods
{   


    // Return medthod to return the surname from the full name.
	public static String getSurname(String enteredString)
	{    
		String surName;
    	int spacePos;
    	
    	surName="";
		
		spacePos = enteredString.indexOf(" ");
    	surName = enteredString.substring(spacePos + 1); 
				
		return surName;
	}


	// Return medthod to return the firstname from the full name.
	public static String getFirstname(String enteredString)
	{    
		String surName;
    	int spacePos;
    	
    	surName="";
		
		spacePos = enteredString.indexOf(" ");
    	surName = enteredString.substring(0,spacePos); 
				
		return surName;
	}
	
	
	// Return medthod to count the number of charaters in the string.
	public static int getNoOfChars(String enteredString)
	{    

    	int noOfChars;

		noOfChars = enteredString.length();
				
		return noOfChars;
	}
	
	
	// Return medthod to count the number of upper case caharater in the string.
	public static int getNoOfUpperChars(String enteredString)
	{   	

    	int upperCase;
    	
    	upperCase=0;

		for (int k = 0; k < enteredString.length(); k++) 
		{
   			 // Check for uppercase letters.
    		if (Character.isUpperCase(enteredString.charAt(k))) upperCase++;
		}

		return upperCase;
	}
	
	// Return medthod to take in a string and output the reverse.
	public static int reverseString(String enteredString)
	{   	

    	int count;
    	
    	upperCase=0;

		for (int k = 0; k > enteredString.length(); k++) 
		{
   			surName = enteredString.substring(spacePos + 1); 
		}

		return upperCase;
	}	
	
	// Main method
    public static void main(String[] args)
    {		
   		
    	String name; 
	    
    	System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
    
		System.out.println("\nYour surname is: " + getSurname(name) );    
		System.out.println("\nYour firstname is: " + getFirstname(name) ); 
		System.out.println("\nThe number of charaters in your name is (inc. spaces): " + getNoOfChars(name) );     
		System.out.println("\nThe number of upper case charaters is: " + getNoOfUpperChars(name) );                           
    }

}

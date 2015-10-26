class Jlab62

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				12/12/14
// Purpose : Write a method called isAlpha() that takes a character as its argument and returns true if the character is alphabetic i.e. in the range A-Z, a-z, otherwise it returns false.
{
	
    public static void main(String[] args)// Main method
    {
		String enteredString=""; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a string and ill tell you if it only contains valid charaters (a-Z). \n\n");
		enteredString = EasyIn.getString();
		
		isAlpha(enteredString);                                  
    }
    
    // Check if argument is an even or odd number.
	public static void isAlpha(String enteredString)
	{
	
	int countValid=0;
	int x=0;
	
        for(x=0; x < enteredString.length(); x++) 
        {
        	if(enteredString.charAt(x) >= 'a' && enteredString.charAt(x) <= 'z' || enteredString.charAt(x) >= 'A' && enteredString.charAt(x) <= 'Z' || enteredString.charAt(x) == ' ' ) 
	     	{
	     		countValid++; // If current char A-z count as valid
	     	}	     	
        }
        
        if(enteredString.length() == countValid)
	    {
	    	System.out.println("True");
	    }
	    else
	    {
	    	System.out.println("False");
	    }
        
	}
}

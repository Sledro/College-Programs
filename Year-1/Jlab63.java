class Jlab63

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/12/14
// Purpose : Write a method alphaCount() that takes a string as its argument and returns the number of alphabetic characters in that string
{
	
    public static void main(String[] args)// Main method
    {
		String enteredString=""; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a string and ill tell you the number of alphabetic characters in that string. \n\n");
		enteredString = EasyIn.getString();
		
		System.out.println(alphaCount(enteredString));  
		                               
    }
    
   
	public static int alphaCount(String enteredString)
	{
	
	int countValid=0;
	int x=0;
	
        for(x=0; x < enteredString.length(); x++) 
        {
        	if(enteredString.charAt(x) >= 'a' && enteredString.charAt(x) <= 'z' || enteredString.charAt(x) >= 'A' && enteredString.charAt(x) <= 'Z' ) 
	     	{
	     		countValid++; // If current char A-z count as valid
	     	}	     	
        }
        return countValid;    
	}
}

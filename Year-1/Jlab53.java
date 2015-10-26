class Jlab53

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/11/14
// Purpose : Modify program 51 to output number of words, average, min and max chars in the words in the string.
{
	
    public static void main(String[] args)// Main method
    {  	
    	String sentence;
       
    	System.out.println("Enter a sentence and ill tell you the number of words, average, min and max chars in the words inside the string. \n ");
		sentence = EasyIn.getString();
		
		countWordsAveMinMax(sentence);                                      
    }
    
    
	public static void countWordsAveMinMax(String enteredString)// Void Method used to count valid words in a string
	{
	
		char space=' '; 
	    int space1=0;
	    int space2=0;
	    int countWords=0;
	    int countValid=0;
	    int countChars=0;
	    int countCharsTotal=0;
	    int	spaces=0;
        int finalChar=0;
       	int largest=0;
		int smallest=999;
		double average;
        
	    for(int i = 0; i < enteredString.length(); i++) // Look at each charater individually from pos0 to end
		{	    	
	    	if(enteredString.charAt(i) == space || i == enteredString.length()-1 ) // Compare each charater to our space var OR the end of string lenght, -1 because starts at 0
	     	{	     		
	     		space1=i; // Set space1 to the first space
	     		spaces++;
	     		
	     		for(int x = space2; x < space1; x++) // run from new first space to second (starting at 0)
	    		{
	    		    if(enteredString.charAt(x) == space) // Compare each charater to our space var
	     			{
  			     		space2=x; 
	     			}
	     			
	     			countChars=space1-space2; // Count number of chars from space to space
	     				     			
	     			countValid++; // Count number of chars from loop 
	     				     				
	     			if(countValid==countChars)
	     			{
	     				countWords++; // Compare values and count if equal
	     			}     			
	   			}
	   			
	   			if(countChars > largest)
				{
					largest = countChars;																		
				}				
				if(countChars < smallest)
				{
					smallest = countChars;	
				}

	   			 countValid=0; // Reset the valid counter
	   		     space2=space1; // Move space 2 up to space 1	   			
	     	 }     			
	     	 	countCharsTotal++; // CountChars including spaces    
	     	 	finalChar = countCharsTotal - spaces +1; // - spaces			
		}
		
		//do average math
		average = countWords / finalChar;
			
		System.out.println("\nYou have entered [ " + countWords + " ] words."); // Finally print the count
		System.out.println("\nYou have entered [ " + finalChar + " ] charaters.");
		System.out.println("\n[ " + average + " ] was the the average number of charaters.");
		System.out.println("\n[ " + smallest + " ] was the smallest number entered.");
		System.out.println("\n[ " + largest + " ] was the largest number entered.");		
	}
}
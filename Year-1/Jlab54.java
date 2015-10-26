class Jlab54

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				09/12/14
// Purpose : Programs 5.1 -> 5.3 Methods in this class with a menu select main method.
{
	
    public static void main(String[] args)// Main method
    {
		menu();                                    
    }

	public static void menu()
	{

    	int selectedOption=0; 	
    	String sentence=""; 
    	String shutdown="";     
                                                                                                                                                                                                                              
       	System.out.println("\n Enter the number of the menu option that you would like to use: \n \n 1. Count words, average, min and max \n \n 2. Count valid words in a string \n \n 3. Reverse a String \n"); 
		selectedOption = EasyIn.getInt();
		
		switch (selectedOption)
		{
			// Word count, Average Charaters per word, Min and Max Charaters per word.
			case 1:
			  			    		
    		System.out.println("\n Enter a sentence and ill tell you the number of words, average, min and max chars in the words inside the string. \n ");
			sentence = EasyIn.getString();
		
			countWordsAveMinMax(sentence); 
	   		
			break;
			
			// Count Valid Words inside a string.
			case 2: 
			
			System.out.println("\n Enter a sentence and ill tell you the number of words inside the string. \n\n");
			sentence = EasyIn.getString();
		
			countWords(sentence);  
	   		
			break;
			
			// Reverse String
			case 3: 
			
			System.out.println("\n Enter a sentence and ill reverse the string. \n\n");
			sentence = EasyIn.getString();
		
			reverseString(sentence);  
				
			System.out.println("\n Would you like to run again ?. Y = Yes | N = No \n\n");
			shutdown = EasyIn.getString();
			
			System.out.println("\n SHUTDOWN: " + shutdown);	 
			
			if (shutdown == "N" || shutdown == "n")	
			{
				System.out.println("\n GOODBYE ! ");
			}
			else if (shutdown == "Y" || shutdown == "y")
			{
				menu();
				System.out.println("\n TEST ! ");
			}  
				
			break;			 
    	}
    	
	}    
		
    // Void Method used to count valid words in a string
	public static void countWordsAveMinMax(String enteredString)
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
	     		spaces++; // Running counter for total num of spaces
	     		
	     		for(int x = space2; x < space1; x++) // run from new first space to second (starting at ip0)
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
		
		// Do average math
		average = finalChar / countWords;
			
		System.out.println("\nYou have entered [ " + countWords + " ] words."); 
		System.out.println("\nYou have entered [ " + finalChar + " ] charaters.");
		System.out.println("\n[ " + average + " ] was the the average number of charaters.");
		System.out.println("\n[ " + smallest + " ] was the smallest number entered.");
		System.out.println("\n[ " + largest + " ] was the largest number entered.");		
	}
	
	
	// Void Method used to count valid words in a string
	public static void countWords(String enteredString)
	{
	
		char space=' '; 
	    int space1=0;
	    int space2=0;
	    int countWords=0;
	    int countValid=0;
	    int countChars=0;
    
	    for(int i = 0; i < enteredString.length(); i++) // Look at each charater individually from pos0 to end
		{	    	
	    	if(enteredString.charAt(i) == space || i == enteredString.length()-1 ) // Compare each charater to our space var OR the end of string lenght, -1 because starts at 0
	     	{	     		
	     		space1=i; // Set space1 to the first space
	     		
	     		for(int x = space2; x < space1; x++) // run from new first space to second (starting at 0)
	    		{
	    		    if(enteredString.charAt(x) == space) // Compare each charater to our space var
	     			{
  			     		space2=x; 
	     			}
	     			
	     			countChars=space1-space2; // Count number of chars from space to space
	     			
	     			if(enteredString.charAt(x) >= 'a' && enteredString.charAt(x) <= 'z' || enteredString.charAt(x) >= 'A' && enteredString.charAt(x) <= 'Z' ) // Compare each charater to our lower case range
	     			{
	     				countValid++; // If current char A-z count as valid
	     			}
	     			
	     			if(countValid==countChars)
	     			{
	     				countWords++; // Compare values and count if equal
	     			}
	   			}
	   			 countValid=1; // Reset the valid counter
	   		     space2=space1; // Move space 2 up to space 1	   			
	     	 }     			
		}			
		System.out.println("\nYou have entered [ " + countWords + " ] valid words. =)"); // Finally print the count
	}

	// Void Method used to count reverse a string.
	public static void reverseString(String enteredString)
	{
	
        String reversedString = "";
        String shutdown;
        
        for(int i=enteredString.length(); i>0; i--) 
        {
            reversedString += enteredString.charAt(i-1);
        }   

        System.out.println("\n Reversed String: " + reversedString );
        
	}		
}

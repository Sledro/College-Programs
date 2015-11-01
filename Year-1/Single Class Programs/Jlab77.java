class arrayCompare

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				30/03/15
// Purpose :			Dans awesome array of strings searcher

{   

    // Void method to fill the array 
	public static void fillArray(String stringArray[])
	{    
		int index;

		for (index = 0; index <= stringArray.length-1; index ++)
    		{
    			System.out.print("\nEnter string #" + (index + 1) + " at position " + (index) + " : "); 
				stringArray[index] = EasyIn.getString();	
    		}
	}

	//List out all the names in the array
	public static void listNames(String stringArray[])
	{
		for (int index = 0; index < stringArray.length; index ++)
	    		{
	    			System.out.println(stringArray[index]);	
	    		}
	    			
	}
					
	
    // Void method to compare two strings
	public static void compareStrings(String stringArray[])
	{    
		int index;
		int index2;

		for (index = 0; index < stringArray.length; index ++)
    		{
    			for (index2 = 0; index2 < 1; index2 ++)
    			{
						 		
					if(stringArray[index].charAt(index2) == stringArray[index].charAt(index2+1))
					{
						System.out.println("\nThe string with first and second chars the same is "+ stringArray[index] +" and its at position " + index + ""); 
					}
					
    			}
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
		
		// I output the filled array for the craic.
		
		System.out.println("");
		System.out.println("========THE FILLED ARRAY IS===========");	
		listNames(stringArray);  
		System.out.println("======================================");		
		
		compareStrings(stringArray);  //Now loop though array and look for same chars	
    }
}

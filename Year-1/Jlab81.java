class Jlab81

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				22/02/15
// Purpose :			1)	Write a method findHighest that takes an array of integers as its argument and returns as its result the index position of the highest number in the array

{   

    // Return method to return the index position of the highest number in the array. 
	public static int findHighestIndex(int numbersArray[], int highest)
	{ 
		int index;	
		int indexPos=0;

		for (index = 0; index <= numbersArray.length-1; index ++)
    		{
				if(numbersArray[index] == highest)
				{
					indexPos = index;	
				}
    		}
    		 
    	return indexPos;		 
	}
	
    // Return method to find the highest number in the array. 
	public static int highestNum(int numbersArray[])
	{    
		int index;
		int highest=0;		
			
		highest = numbersArray[0];	
    
		for (index = 0; index <= numbersArray.length-1; index ++)
    		{
				if(numbersArray[index] > highest)
				{
					highest = numbersArray[index];	
				}
    		}
    		 
    	return highest;
	}
		
    // Void method to fill the array 
	public static void fillArray(int numbersArray[])
	{    
		int index;

		for (index = 0; index <= numbersArray.length-1; index ++)
    		{
    			System.out.print("\nEnter number " + (index + 1) + " : "); 
				numbersArray[index] = EasyIn.getInt();	
    		}
	}
				
	// Main method
    public static void main(String[] args)
    {		
   		int numbersArray[];
    	int arraySize;
    	int highest;
	    
    	System.out.print("\nPlease enter the amout of numbers you need to enter: "); 
		arraySize = EasyIn.getInt();
		
		numbersArray = new int[arraySize]; // SET numbersArray[arraySize]
		fillArray(numbersArray); // PASS the array strcture to be filled by user
		highest = highestNum(numbersArray); // SET highest so it can be used in the method below.
		
		System.out.println("\nThe highest number you entered was : " + highest ); 
		System.out.println("\nThe index position of [" + highest + "] is : " + findHighestIndex(numbersArray, highest)); 

    }
}

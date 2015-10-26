class Jlab73

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/12/14
// Purpose :	3)	Modify 2) above so that it tells you how many times the highest and lowest number appeared

{   


    // Void method to fill the array 
	public static void fillArray(int numArray[])
	{    
		int index;
		int arraySize;
	
		arraySize = numArray.length-1;		
    
		for (index = 0; index <= arraySize; index ++)
    		{

    			System.out.print("\nEnter number " + (index + 1) + " : "); 
				numArray[index] = EasyIn.getInt();

    		}
	}

    // Return method to return the highest int in the array
	public static int highest(int numArray[])
	{    
		int index;
		int arraySize;
		int highest=0;
		
		arraySize = numArray.length-1;
		
		highest = numArray[0];
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] > highest)
				{
					highest = numArray[index];	
				}

    		}

    		return highest; 
	}
		
    // Return method to return the lowest int in the array
	public static int lowest(int numArray[])
	{    
		int index;
		int arraySize;
		int lowest=0;
		
		arraySize = numArray.length-1;
		
		lowest = numArray[0];
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] < lowest)
				{
					lowest = numArray[index];
				}
    		}
    		
    		return lowest; 
	}
	
    // Return method to count the number of times the highest number is in the array,
	public static int countLowest(int numArray[], int lowest)
	{    
		int index;
		int arraySize;
		int countLowest=0;
		
		arraySize = numArray.length-1;
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] == lowest)
				{
					countLowest++;
				}
    		}
    		
    		return countLowest; 
	}
	
    // Return method to count the number of times the highest number is in the array,
	public static int countHighest(int numArray[], int highest)
	{    
		int index;
		int arraySize;
		int countHighest=0;
		
		arraySize = numArray.length-1;
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] == highest)
				{
					countHighest++;
				}
    		}
    		
    		return countHighest; 
	}
			
	// Main method
    public static void main(String[] args)
    {		
   		
   		int numArray[];
    	int numOfNums;
	    
    	System.out.print("\nHow many numbers in the array ?: "); 
		numOfNums = EasyIn.getInt();
		
		numArray = new int[numOfNums]; // SET numArray[numOfNums]
		fillArray(numArray); // PASS the array strcture to be filled by user
		countLowest(numArray,lowest(numArray));
		
		System.out.print("\nThere lowest number entered is " + lowest(numArray) + " "); 
    	System.out.println("\nThere highest number entered is " + highest(numArray) + " ");
    	System.out.println("\nThe lowest number was entered " + countLowest(numArray, lowest(numArray)) + " times.");
    	System.out.println("\nThe highest number was entered " + countHighest(numArray, highest(numArray)) + " times.");
                          
    }

}

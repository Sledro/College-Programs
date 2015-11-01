class Jlab72

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/12/14
// Purpose :	2)	Write a program that reads in an array of integers and then tells you the highest and lowest numbers in the array

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

    // Void method to fill the array 
	public static void highAndLow(int numArray[])
	{    
		int index;
		int arraySize;
		int highest=0;
		int lowest=0;
		
		arraySize = numArray.length-1;
		
		highest = numArray[0];
		lowest = numArray[0];
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] > highest)
				{
					highest = numArray[index];	
				}
				if(numArray[index] < lowest)
				{
					lowest = numArray[index];
				}
    		}
    		
    		System.out.print("\nThere lowest number entered is " + lowest + " "); 
    		System.out.println("\nThere highest number entered is " + highest + " "); 
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
		
		highAndLow(numArray);
                          
    }

}

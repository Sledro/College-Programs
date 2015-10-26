class Jlab71

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/12/14
// Purpose : 1)	Write a program that reads in an array of integers and then displays the number of odd 
//				and even numbers in the array. Use a method you have written already isEven()on each array element. 
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
	public static void countOddEven(int numArray[])
	{    
		int index;
		int arraySize;
		int countOdd=0;
		int countEven=0;
		
		arraySize = numArray.length-1;
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] % 2 == 0)
				{
					countOdd++;	
				}
				else
				{
					countEven++;
				}
    		}
    		
    		System.out.print("\nThere numer of odd numbers entered is " + countOdd + " "); 
    		System.out.print("\nThere numer of even numbers entered is " + countEven + " "); 
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
		
		countOddEven(numArray);
                          
    }

}

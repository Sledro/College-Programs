class Jlab73

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				18/02/15
// Purpose :	4)	Write a program that reads in an array of alphabetical characters and tells you how many vowels and consonants 
//					were present in the array. Hint - write this in such a way that avoids large compound conditions.

{   


    // Void method to fill the array 
	public static void fillArray(int charArray[])
	{    
		int index;
		int arraySize;
	
		arraySize = charArray.length-1;		
    
		for (index = 0; index <= arraySize; index ++)
    		{

    			System.out.println("\nEnter charater " + (index + 1) + " : "); 
				charArray[index] = EasyIn.getChar();


				System.out.println("\nChar " + charArray[index] + " Pos:" + index +""); 
    		}
	}

	
    /* Return method to count the number of vowels in the array.
	public static int countVowels(char charArray[])
	{    
		char vowelArray[] = {a,e,i,o,u};
		int arraySize;
		int counter=0;
		
		
		arraySize = numArray.length-1;
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] == lowest)
				{
					counter++;
				}
    		}
    		
    		return counter; 
	}
	
*/
			
	// Main method
    public static void main(String[] args)
    {		
   		
   		char charArray[];
    	int charInput;
	    
    	System.out.print("\nPlease enter the amout of charaters you need to enter: "); 
		charInput = EasyIn.getInt();
		
		charArray = new char[charInput]; // SET numArray[numOfNums]
		fillArray(charArray); // PASS the array strcture to be filled by user
	
		
		System.out.print("\nThere lowest number entered is "); 

                          
    }

}

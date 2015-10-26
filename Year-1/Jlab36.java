class TestMethod1

// Student Name : 		Enda Dunican
// Student Id Number : 		COM1234
// Date :				1/9/2005
// Purpose : 			A Sample program to illustrate a method

{
	
		
	public static void printString(String theString)// parameter	
	
	{
	
	// This method takes a string and prints each 
	// character on a separate line 
	   
	int index; //local variable
    
    	for (index = 0; index <= theString.length() - 1; index ++)
   			{
       			System.out.println (theString.charAt(index));
   			}		
	}
	
    public static void main(String[] args)

    {
    	String sentence;
 
       
    	System.out.print("Enter a sentence ");
		sentence = EasyIn.getString();
		printString(sentence); // sentence is the argument supplied to 
                             // the method
    }
}

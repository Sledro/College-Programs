class Jlab51

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/11/14
// Purpose : Write a program which will input a string from the keyboard, and output the number of 
//			 separate words, where a word is one or more characters separated by spaces. Your program should 
//		     only count as words groups of characters in the ranges A..Z and a..z
{

	public static void countWords(String enteredString)// parameter	
	
	{
	
		char space = ' '; 
	    int space1=0;
	    int space2=0;
	    int countInvalid=0;
	    int countValid=0;
    
	    for(int i = 0; i < enteredString.length(); i++) // Look at each charater individually
	    {
	    	if(enteredString.charAt(i) == space) // Compare each charater to our space var
	     	{	     		
	     		space1=i;
	     		
	     		for(int x = space2; x < space1; x++)// Look at each charater individually
	    		{
  			     

	   			}
	   			
	   		    space2=i;  			   			
	     	}
	     	
	     			
		}
				System.out.println("Space 1: " + space1);
				System.out.println("Space 2: " + space2);
		
	}
	


	
	
    public static void main(String[] args)

    {
    	
    	String sentence;
       
    	System.out.println("Enter a sentence and ill tell you have many words you entered. \n ");
		sentence = EasyIn.getString();
		
		countWords(sentence); 
	 
           
                             
    }
}


	    
	    //	if(enteredString.charAt(i) >= 'a' && enteredString.charAt(i) <= 'z' || enteredString.charAt(i) >= 'A' && enteredString.charAt(i) <= 'Z' ) // Compare each charater to our lower case range
	    // 	{
	    // 		countValid++;
	    // 	}
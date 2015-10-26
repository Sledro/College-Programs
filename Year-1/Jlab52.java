class Jlab52

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/11/14
// Purpose : Modify program 51 to output the users input in reverse.
{
	
    public static void main(String[] args)// Main method
    {  	
    	String sentence;
       
    	System.out.println("Enter a sentence and ill reverse what input. \n ");
		sentence = EasyIn.getString();
		
		reverseString(sentence);                                      
    }
    
    
	public static void reverseString(String enteredString)// Void Method used to count valid words in a string
	{
	
        String reversedString = "";
        
        for(int i=enteredString.length(); i>0; i--) {
            reversedString += enteredString.charAt(i-1);
        }   

        System.out.println("" + reversedString );
	}
}



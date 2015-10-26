class Jlab44

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : 			4) Modify the program produced in (1) so that it writes out the number of uppercase characters in the user's input.


 
{
    public static void main(String[] args)
	{

		String name; 
    	int noOfUpperChars;
    	int upperCase=0;
    	int lowerCase=0;
  

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
	
		for (int k = 0; k < name.length(); k++) 
		{
   			 // Check for uppercase letters.
    		if (Character.isUpperCase(name.charAt(k))) upperCase++;
		}

		System.out.print("There are " + upperCase + " uppercase letters");

	}
}

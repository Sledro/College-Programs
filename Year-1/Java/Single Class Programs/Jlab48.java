class Jlab48

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : Modify the program produced in (1) so that it writes out the user's input 
//           with any middle name removed (Joe Handsome Doe becomes Joe Doe)

{
    public static void main(String[] args)
	{

		String name; 
	    String firstName;
    	String surName;
    	int spacePos;
    	int spacePos2;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		spacePos = name.indexOf(" "); //Find the index position on the first space
		spacePos2 = name.lastIndexOf(" "); //Find the index position on the LAST space
		
    	surName = name.substring(spacePos2 + 1); //Split the string and get everything after the last space
    	firstName = name.substring(0, spacePos); //Split the string and get everything before the first space
				
		System.out.println("\nYour surname is: " + firstName + " " + surName );

	}
}



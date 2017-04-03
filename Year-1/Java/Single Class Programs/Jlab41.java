class Jlab41

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : 		1) Write and test a program which will prompt the user to enter their name, read in the name, and write to the 
//					screen just the surname. (Where surname is interpreted as everything after the first space).


 
{
    public static void main(String[] args)
	{

		String name; 
	    String firstName;
    	String surName;
    	int spacePos;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		spacePos = name.indexOf(" ");
    	surName = name.substring(spacePos + 1); 
				
		System.out.println("\nYour surname is: " + surName );

	}
}

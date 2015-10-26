class Jlab46

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : Modify the program produced in (1) so that it writes out the user's input with the names reversed 
//			 (Joe Doe is output as Doe Joe).



{
    public static void main(String[] args)
	{

		String name; 
    	String firstName;
    	int spacePos;
    	String surName;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		spacePos = name.indexOf(" ");
    	firstName = name.substring(0, spacePos); 
    	surName = name.substring(spacePos); 
    	
    	surName = new StringBuilder(surName).reverse().toString();
    	firstName = new StringBuilder(firstName).reverse().toString();
				
		System.out.println("\nYour input reversed is: " + surName + "" + firstName );

	}
}


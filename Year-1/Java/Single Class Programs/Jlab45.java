class Jlab45

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : 			Modify the program produced in (1) so that it writes out the user's input reversed (Joe Doe is output as eoD eoJ).


{
    public static void main(String[] args)
    
	{

		String name; 
    	String surName;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
    	surName = new StringBuilder(name).reverse().toString();
				
		System.out.println("\nYour surname is: " + surName );

	}
}


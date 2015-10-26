class Jlab42

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : 		2) Modify the program produced at (1) so that it writes out the first name (everything up to the first space) instead of the surname.


 
{
    public static void main(String[] args)
	{

		String name; 
    	String firstName;
    	int spacePos;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		spacePos = name.indexOf(" ");
    	firstName = name.substring(0, spacePos); 
				
		System.out.println("\nYour surname is: " + firstName );

	}
}

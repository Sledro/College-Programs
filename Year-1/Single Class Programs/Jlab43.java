class Jlab43

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : 		3) Modify the program produced in (1) so that it writes out the number of characters in the user's input.


 
{
    public static void main(String[] args)
	{

		String name; 
    	int noOfChars;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		noOfChars = name.length();
				
		System.out.println("\nThere is " + noOfChars + " charaters in your name." );

	}
}

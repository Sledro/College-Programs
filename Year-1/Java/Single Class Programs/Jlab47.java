class Jlab47

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				31/10/14
// Purpose : ) Modify the program produced in (1) so that it writes out the number of occurrences of the letter a in the user's input. (Treat A and a as the same character).



{
    public static void main(String[] args)
	{

		String name;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		

		char i = 'a';//getting the character by itself
        int counter=0;
        for(int index= 0; index< name.length(); index++)
        {
            char chars = name.charAt(index);
            if (chars==i)//comparing the chosen character to each character in the string
                counter++;//keeping track of how many times you find a match
        }
        
        System.out.println("\nThere is " + counter + " A's and a's in your name. ");

	}
}



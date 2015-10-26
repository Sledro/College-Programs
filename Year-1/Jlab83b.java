class Jlab83b

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				22/02/15
// Purpose :			3)	Write a program using methods as described in your notes that maintains an array of strings in alphabetical order. The program should 
//							present the user with a menu option as follows: 
{   
	//List out all the names in the array
	public static void listNames(String theArray[], String theName, int noOfValues)
	{
		for (int index = 0; index < theArray.length; index ++)
	    		{
	    			System.out.println(theArray[index]);	
	    		}
	    			
	}	

	//Let the user input a name, find the location, add it to the array, and return the current number of elements
	public static void addName(String theArray[], String theName, int noOfValues)
	{
		String newName="";
		int location;
		int noOfElements=0;
				
		
		System.out.print("Enter a name :");
		theName = EasyIn.getString();		
				
		location = findPlace(theArray,theName,noOfValues);
		noOfElements = addOne(theArray,location,theName,noOfValues);
		
		
		menu(theArray, newName, noOfElements);				   	    
	
	}
	


	//Look at the array and find the correct location to put the name
	public static int findPlace(String theArray[], String theName, int noOfValues)		
	{
   
	int step; 
	int place;
	
    
	 step = 0 ;
 	while ((step < noOfValues) && (theName.compareTo(theArray[step]) > 0))
		{
			step ++;
		}
	place = step ;   // Holds the correct location of place	
	return place;    // method must return an int
	
	}
	
	
	// Add the name to the array after the correct location "findPlace" is found
	public static int addOne(String theArray[], int place, String theName, int noOfValues)	
	{
	 
	 int step;
	
	 if (noOfValues == 0)
		{
			theArray [0] = theName;
			noOfValues ++;	
		}
	 else
		{					
			for (step = noOfValues - 1 ; step >= place; step --)
			    {
			       theArray[step + 1] = theArray[step] ; 
			    }
			theArray[place] = theName;			
			noOfValues ++;
		}

	return noOfValues;
	}

	// Add the name to the array after the correct location "findPlace" is found
	public static int remOne(String theArray[], int place, String theName, int noOfValues)	
	{
	 
	 int step;
	
	 if (noOfValues == 0)
		{
			theArray [0] = theName;
			noOfValues ++;	
		}
	 else
		{					
			for (step = noOfValues - 1 ; step >= place; step --)
			    {
			       theArray[step + 1] = theArray[step] ; 
			    }
			theArray[place] = theName;			
			noOfValues ++;
		}

	return noOfValues;
	}
	
    // Void Method to Display Menu
	public static void menu(String theArray[], String theName, int noOfValues)
	{
		boolean exit=false;
		
		do{
			
	    	int selectedOption=0; 
						    					    		
			System.out.println("\nEnter the number of the menu option that you would like to use: \n \n 1) Add Name \n 2) Delete Name \n 3) Search for a Name \n 4) List all Names \n 5) Exit \n"); 
			selectedOption = EasyIn.getInt(); 
			System.out.println(selectedOption);
			
			switch (selectedOption)
			{
				// Add Name
				case 1:
				addName(theArray, theName, noOfValues);	  		
				break;
				
				// Delete Name
				case 2: 
	            deleteName(theArray, theName, noOfValues);	
				break;
				
				// Search for a Name
				case 3: 
				//searchName();    		
				break;
				
				// List all Names
				case 4:
	            listNames(theArray, theName, noOfValues);		
				break;
				
				// Exit
				case 5:
				exit=true;	
				break;
			}
			
		   }while(exit=false); 
	}
			
	// Main method
    public static void main(String[] args)   	
    {
    	String newName="";
    	int location;
    	String theArray[];
    	int noOfElements=0;
    	int index;
    	
    	theArray = new String[5];
    		
		menu(theArray, newName, noOfElements);
		
    }
}







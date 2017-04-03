class CustomerUse
{

  // Student Name : 		Daniel Hayden
  // Student Id Number : 	C00137009
  // Date :					19/03/2015
  // Purpose : 				Second Java Project - Object Orientation

	// List all the elements in theArray
	public static void listAll(Customer theArray[],int noOfValues)
	{
		for (int index = 0; index < 3; index ++)
			{							
				System.out.println(theArray[index].toString());
    		}
    	menu(theArray,noOfValues);
	}
	
    // Display the user menu
	public static void menu(Customer theArray[], int noOfValues)
	{
		boolean exit=false;
		
		do{
			
	    	int selectedOption=0; 
						    					    		
			System.out.println("\nEnter the number of the menu option that you would like to use: \n \n 1) Add Customer \n 2) Delete Customer \n 3) List All Customers \n 4) Exit \n \n"); 
			selectedOption = EasyIn.getInt(); 
			System.out.println(selectedOption);
			
			switch (selectedOption)
			{
				// Add a customer
				case 1:
				addCustomer(theArray,noOfValues);	  		
				break;
				
				// Delete a customer
				case 2: 
	            deleteCustomer(theArray,noOfValues);	
				break;
				
				// List all customers
				case 3: 
				listAll(theArray,noOfValues);    		
				break;
				
				// List all Names
				case 4:
	            listAll(theArray,noOfValues);		
				break;
				
				// Exit
				case 5:
				exit=true;	
				break;
			}
			
		   }while(exit=false); 
	}	

	// Present user input to add customer and pass it to the findPlace and addOne methods
	public static void addCustomer(Customer theArray[], int noOfValues)
	{
		Customer tempObject;
    	int index;
    	int noOfElements=0;
    	String newName;
    	String newId;
    	int newBal;
    	int place;
    	int step;
						
		System.out.print("Enter name ");
		newName = EasyIn.getString();
		System.out.print("Enter Id ");
 		newId = EasyIn.getString();
		System.out.print("Enter Balance ");
	 	newBal = EasyIn.getInt();
	 	System.out.println();
		
		if(noOfValues > 0)
		{	
			step = 0 ;
			while(step < noOfValues && !(theArray[step].getId().equals(newId)))
			   {		
					step ++;
			   }
			if (step < noOfValues)
			   {
			   		System.out.println("Sorry, This Customer Id already exists! Try again.");
			   		menu(theArray,noOfValues);
			   }
			else
				{
					tempObject = new Customer(newName,newId,newBal);
					place = findPlace(theArray,newBal, noOfValues);
					noOfElements = addOne(theArray, place, tempObject, noOfValues);	
					   
					menu(theArray,noOfElements);				
				}
			  
		}
		else
		{
					tempObject = new Customer(newName,newId,newBal);
					place = findPlace(theArray,newBal, noOfValues);
					noOfElements = addOne(theArray, place, tempObject, noOfValues);	
					   
					menu(theArray,noOfElements);
		}				   	    
	}
	
	//--EXTRA Search theArray for a customer via customer ID
	public static void searchArray(Customer theArray[], int noOfValues)
	{
		String searchId;
		int step;
		
		System.out.println("Enter Customer ID" ) ;
		searchId = EasyIn.getString();
		step = 0 ;
		while(step < theArray.length && !(theArray[step].getId().equals(searchId)))
		   {		
			step ++;
		   }
		if (step < theArray.length)
		   {
		      System.out.println("ID Number: "+ searchId +" is for " + theArray[step].getName() );
		   }
		else
		   {
			System.out.println(searchId + "Not found in the Array!" + step );	

		   }
		   
		   menu(theArray,noOfValues);
	}
	
	// Find correct location in array to insert the new customer with the highest Balance at position 0
	public static int findPlace(Customer theArray[], int newBal, int noOfValues)		
	{
			   
		int step; 
		int place;
		
	    
		step = 0 ;
		while ((step < noOfValues) && (newBal < theArray[step].getBalance()))	//Loop though array and stop when the newBal is less then the vurrent object bal and insert.
			{
			   step ++;
			}
		place = step ;   // Finds the correct location of place	
		return place;	
	}

	// Move all the elements in the array down one when inserting
	public static int addOne(Customer theArray[], int place, Customer theObject, int noOfValues)	
	{
		 
		 int step;
			
		 if (noOfValues == 0)
			{
				theArray [0] = theObject;
				noOfValues ++;	
			}
		else
			{					
			  	for (step = noOfValues - 1 ; step >= place; step --)
					{
						theArray[step + 1] = theArray[step] ;						
					}
				theArray[place] = theObject;			
				noOfValues ++	;
			}
	
	 		return noOfValues;
	}

	//Let the user input a ID, Delete the data from the object array.
	public static void deleteCustomer(Customer theArray[], int noOfValues)
	{	
		String deleteId;
		int whichOne;
		int step;
		
		System.out.println("Enter ID to be deleted " ) ;
		deleteId = EasyIn.getString();
		step = 0;
		while((step < noOfValues) && (theArray[step].getId().equals(deleteId) == false ))
			{
			  step ++;
			}
		if (step < noOfValues)
			{
			  whichOne = step;
			}
		else
			{
			  whichOne = -1; 
			}
			
		for (step = whichOne; step < noOfValues-- ; step ++)
			{
				theArray[step] = theArray[step + 1];
			}
noOfValues--;
			theArray[noOfValues - 1].setId("");
				theArray[noOfValues - 1].setName("");
					theArray[noOfValues - 1].setBalance(0); // make it empty again
			
			menu(theArray,noOfValues);
	}	
		
	// Main method calling menu			
    public static void main(String[] args)
    {	

    	Customer theArray[]; // an array of Employee objects
		int noOfVlaues=0;

    	
    	
    	theArray = new Customer[3]; // create array
 

    	menu(theArray,noOfVlaues);
   	
    }

}

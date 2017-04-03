class Jlab65

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				14/12/14
// Purpose : Rewrite the following program using a loop structure of your choice. But this time you implement a method called menu for the menu option, 
//           and a method for each conversion e.g. fahrToCel(), celToFahr(), inchToCent() etc. 
//			 The program keeps presenting the user with options until the user enters the value 7 to exit
{
	
	
    public static void main(String[] args)// Main method
    {		
		menu();                                  
    }
    
    // Options menu
	public static void menu()
	{
		
		boolean exit=false;
		
		do{
			
    	int selectedOption=0; 
					    					    		
		System.out.println("\nEnter the number of the menu option that you would like to use: \n \n 1.     Fahrenheit to celcius \n 2.	Celcius to Fahrenheit \n 3.	Inches to centimetres \n 4.	Centimetres to inches \n 5.	Pounds to Kilograms \n 6.	Kilograms to pounds \n 7.     Exit Program \n"); 
		selectedOption = EasyIn.getInt(); 
		System.out.println(selectedOption);
			
		switch (selectedOption)
		{
			
			// Fahrenheit to celcius
			case 1:
			fahrToCel();	    		
			break;
			
			// Celcius to Fahrenheit 
			case 2: 
            celToFar();	
			break;
			
			// Inches to centimetres
			case 3: 
			inchToCent();    		
			break;
			
			// Centimetres to inches
			case 4:
            centToInch();		
			break;
			
			// Pounds to Kilograms
			case 5:
			poundsToKilos();
			break;
			
			// Kilograms to Pounds
			case 6:
			kilosToPounds();	
			break;
		
	    	// Kilograms to Pounds
			case 7:
			exit=true;	
			break;
		}
		}while (exit=false);
		
       
	}
	
	public static void fahrToCel()
	{
		double far;
		double cent;
		char reRun=' ';
		
		System.out.println("Enter the tempature in Fahrenheit Cent ->  "); 
		far = EasyIn.getDouble(); 
		
		cent = (far * 9 / 5) + 32; 
		
   		System.out.println("\nThe tempature converted to Degrees is: " + cent); 
   		
   		System.out.println("\n\nDo you want to run the menu again ? Y or N ->  "); 
		reRun = EasyIn.getChar(); 
		
		if(reRun=='Y')
		{
			menu(); 
		}
		else
		{
			System.out.println("\nGOODBYE!"); 
		}
   			
   		  
	}	
				
	public static void celToFar()
	{
		double fahrenheit;
		double cent;
		char reRun=' ';	
		
		System.out.println("Enter the tempature in Degrees Cent ->  "); 
		cent = EasyIn.getDouble(); 
		
		fahrenheit = (cent * 9 / 5) + 32; 
		
   		System.out.println("\nThe tempature converted to Fahrenheit is: " + cent); 
   		
   		try 
   		{
			Thread.sleep(5000); //1000 milliseconds is one second.
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
			
   		menu();   
	}	
				
		
    public static void inchToCent()
	{
		double inches;
		double centimetres;
		char reRun=' ';	
		
		System.out.print("Enter the size in inches ->  "); 
		inches = EasyIn.getDouble(); 
	
		centimetres = inches  * 2.54; 			
	
  		System.out.println("\n" + inches + "inches converts to  " + centimetres + " centimetres"); 
  			
		if(reRun=='Y')
		{
			menu(); 
		}
		else
		{
			System.out.println("\nGOODBYE!"); 
		}  
	}
	
	public static void centToInch()
	{
		double inches;
		double centimetres;
		char reRun=' ';	
		
	    System.out.print("Enter the size in centimetres ->  "); 
		centimetres = EasyIn.getDouble(); 
	
		inches = centimetres  / 2.54; 			
	
  		System.out.println("\n" + centimetres + "centimetres converts to  " + inches + " inches"); 
  			
		if(reRun=='Y')
		{
			menu(); 
		}
		else
		{
			System.out.println("\nGOODBYE!"); 
		} 
	}
	
	public static void poundsToKilos()
	{
		double pounds;
		double kilos;
		char reRun=' ';	
		
	    System.out.print("Enter the size in pounds ->  "); 
		pounds = EasyIn.getDouble(); 
	
		kilos = pounds  / 2.2; 			
	
  		System.out.println("\n" + pounds + "pounds converts to  " + kilos + " kilograms"); 
  			
		if(reRun=='Y')
		{
			menu(); 
		}
		else
		{
			System.out.println("\nGOODBYE!"); 
		} 
	}
	
	public static void kilosToPounds()
	{
		double pounds;
		double kilos;
		char reRun=' ';	
		
	    System.out.print("Enter the size in kilos ->  "); 
		kilos = EasyIn.getDouble(); 
	
		pounds = kilos  * 2.2; 			
	
  		System.out.println("\n" + kilos + "kilos converts to  " + pounds + " pounds"); 
  			
		if(reRun=='Y')
		{
			menu(); 
		}
		else
		{
			System.out.println("\nGOODBYE!"); 
		} 
	}
}

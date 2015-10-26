class Jlab2b6

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				03/10/14
// Purpose : 			6.	Write a simple menu driven program that will present the user with the following conversion menu (look up conversion rates on the internet): 
////////////////

/*
1.	Fahrenheit to celcius
2.	Celcius to Fahrenheit
3.	Inches to centimetres
4.	Centimetres to inches
5.	Pounds to Kilograms
*/

 
{
	
    public static void main(String[] args)
	{

		int selectedOption; 
		double fahrenheit; 
		double cent;
		double inches; 
		double centimetres;     
		double kilos; 
		double pounds;  
					    					    		
		System.out.println("Enter the number of the menu option that you would like to use: \n \n 1. Fahrenheit to celcius \n 2.	Celcius to Fahrenheit \n 3.	Inches to centimetres \n 4.	Centimetres to inches \n 5.	Pounds to Kilograms \n"); 
		selectedOption = EasyIn.getInt(); 
		
		switch (selectedOption )
		{
			// Fahrenheit to celcius
			case 1:
			  			    		
					System.out.println("Enter the tempature in Fahrenheit ->  "); 
					fahrenheit = EasyIn.getDouble(); 
					
					cent = (fahrenheit - 32) * 5 / 9; 
					
			   		System.out.println("The tempature converted to degrees is: " + cent); 
	   		
			break;
			
			// Celcius to Fahrenheit 
			case 2: 
			
					System.out.println("Enter the tempature in Degrees Cent ->  "); 
					cent = EasyIn.getDouble(); 
					
					fahrenheit = (cent * 9 / 5) + 32; 
					
			   		System.out.println("The tempature converted to Fahrenheit is: " + cent); 
	   		
			break;
			
			// Inches to centimetres
			case 3: 
			    		
					System.out.print("Enter the size in inches ->  "); 
					inches = EasyIn.getDouble(); 
				
					centimetres = inches  * 2.54; 			
				
			  		System.out.println( inches + "inches converts to  " + centimetres + " centimetres"); 
			
			break;
			
			// Centimetres to inches
			case 4:
			
				    System.out.print("Enter the size in centimetres ->  "); 
					centimetres = EasyIn.getDouble(); 
				
					inches = centimetres  / 2.54; 			
				
			  		System.out.println( centimetres + "centimetres converts to  " + inches + " inches"); 
			
			break;
			
			// Pounds to Kilograms
			case 5:
			
				    System.out.print("Enter the size in pounds ->  "); 
					pounds = EasyIn.getDouble(); 
				
					kilos = pounds  / 2.2; 			
				
			  		System.out.println( pounds + "pounds converts to  " + kilos + " kilograms"); 
			
			break;
		}										
	}
}

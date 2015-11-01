class tempatureCalc  

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			A tempature calculation program.


 
{
    public static void main(String[] args)
	{

	    double fahrenheit; 
		double cent;  
	    		
		System.out.print("Enter the tempature in Fahrenheit ->  "); 
		fahrenheit = EasyIn.getDouble(); 
		cent = (fahrenheit - 32) * 5 / 9; 
	    System.out.println("The tempature converted to degrees is: " + cent); 
	  
	}
}

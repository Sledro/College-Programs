class Jlab11 

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Input a value in inches, convert it to centimetres.


 
{
    public static void main(String[] args)
	{

	    double inches; 
		double centimetres;  
	    		
		System.out.print("Enter the size in inches ->  "); 
		inches = EasyIn.getDouble(); 
		
		centimetres = inches  * 2.54; 
	
		
	    System.out.println( inches + "inches converts to  " + centimetres + " centimetres"); 
	  
	}
}

class Addition  

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			A simple addition program


 
{
    public static void main(String[] args)
	{

		int num1; 
	    int num2;
	    int sum; 
	    		
		System.out.print("Enter the first number ->  "); 
		num1 = EasyIn.getInt();
		System.out.print("Enter the second number ->  ");
		num2 = EasyIn.getInt(); 
		sum = num1 + num2; // Calculate sum
	    System.out.println("The sum of the two numbers is " + sum); 
	  
	}
}

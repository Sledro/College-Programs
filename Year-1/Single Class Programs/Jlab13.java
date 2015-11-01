class Jlab13

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Enter three numbers, and display, their sum, product and the average of the three.

 
{
    public static void main(String[] args)
	{

	    double num1; 
		double num2;  
		double num3;
		double sum;
		double product;
		double average;
			    		
		System.out.print("Enter the first number ->  "); 
		num1 = EasyIn.getDouble(); 
		System.out.print("Enter the second number ->  "); 
		num2 = EasyIn.getDouble(); 
		System.out.print("Enter the third number ->  "); 
		num3 = EasyIn.getDouble(); 
		
		sum = num1 + num2 + num3;				
	    product = num1 * num2 * num3;
	    average = sum / 3;
	    		 
	    System.out.println("The sum is " + sum); 
	    System.out.println("The product is " + product); 
	    System.out.println("The average is " + average); 
	}
}

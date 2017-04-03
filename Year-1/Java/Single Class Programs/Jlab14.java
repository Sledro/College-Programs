class Jlab14

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Enter three numbers, and display, their sum, product and the average of the three.
//                      Modify this program so that it displays current sum, product and average after each number is added.

 
{
    public static void main(String[] args)
	{

	    double num1; 
		double num2;  
		double num3;
		
		double sum1;
		double product1;
		double average1;
		
		double sum2;
		double product2;
		double average2;
					    		
		System.out.print("Enter the first number ->  "); 
		num1 = EasyIn.getDouble(); 
		
		System.out.println("The sum is " + num1); 
	    System.out.println("The product is " + num1); 
	    System.out.println("The average is " + num1); 
	    
		System.out.print("Enter the second number ->  "); 
		num2 = EasyIn.getDouble(); 
		
		sum1 = num1 + num2;				
	    product1 = num1 * num2;
	    average1 = sum1 / 2;
	    		
		System.out.println("The sum is " + sum1); 
	    System.out.println("The product is " + product1); 
	    System.out.println("The average is " + average1); 
	    
		System.out.print("Enter the third number ->  "); 
		num3 = EasyIn.getDouble(); 
		
		sum2 = num1 + num2 + num3;				
	    product2 = num1 * num2 * num3;
	    average2 = sum2 / 3;
	    		 
	    System.out.println("The sum is " + sum2); 
	    System.out.println("The product is " + product2); 
	    System.out.println("The average is " + average2); 
	}
}

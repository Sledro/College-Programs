/*
** Author: DH	Date: October 2015
** Purpose: Write a Java application to input a number and quantity sold and calc the retail
*		value of the goods sold. Use a switch. 
*/

public class Ex2q5
{
	public static void main(String args[])
	{
		int productID=0;
		int quantity=0;
		double product=0;
		double answer=0;
		
		while(productID<=0 || productID>=6){			
			System.out.println("Please enter the product ID: ");
			productID = EasyIn.getInt();
			
			if(productID <=0 || productID>=6){
				System.out.println("ERROR: Please enter a valid product number.");
			}
			else{
				System.out.println("Please enter the quantity: ");
				quantity = EasyIn.getInt();
			}
		}
			
		  switch (productID) {
		  case 1:  product = 2.98;
		           break;
		  case 2:  product = 4.50;
		           break;
		  case 3:  product = 9.98;
		           break;
		  case 4:  product = 4.49;
		           break;
		  case 5:  product = 6.87;
		           break;
		  }	
		  
		  answer=product*quantity;
		  
		  System.out.println("This will set you back €" + answer);
		
	}
}

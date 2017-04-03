class Jlab34

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				9/10/14
// Purpose : 		4)	Write a program to find the largest, smallest and average value in a collection of N numbers. 
///                     (Run the program numbers.exe on the Common Disk to see how it should work)


 
{
    public static void main(String[] args)
	{

		int num;
		int num1;
		int largest;
		int smallest;
		double average=0;
		int count=1;
	    boolean exit = false;
	    double newAve;
	    
	    System.out.println("Enter 0 at anytime to exit. ");
	    System.out.print("Enter your first number from your list: ");
	    num1 = EasyIn.getInt();
	    
	    largest=num1;
	    smallest=num1;
	    
	     average = average + num1;
	    
		   	while(exit == false)
			{
				 		
				System.out.print("\nEnter the next number form your list: "); 
				num = EasyIn.getInt();
				
				if (num == 0)
				{					
					exit = true;
				}
				else if(num > largest)
				{
					largest = num;													
					
				}				
				else if(num < smallest)
				{
					smallest = num;	
				}
				
				 count++;
				
				 average = average + num;
				 newAve = average / count;
				
				 
				 System.out.println("\nThe average of the numbers entered is : " + newAve );	
				 System.out.println("\nCurrent Count : " + count );
				
			
		    }
		    
		    	    
		    	System.out.println("\nThe largest number entered is :  -> " + largest );
		    	System.out.println("\nThe smallest entered :  -> " + smallest );	    	    	
	}
}

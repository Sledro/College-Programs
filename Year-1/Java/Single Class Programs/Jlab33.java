class Jlab33

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				9/10/14
// Purpose : 		3)	Write a program to read a list of integer values which will find and display the index of the first occurrence and the last occurrence of the number 12. Your program 
//						should print the Index values of 0 (zero) if the number 12 is not found. The index is the sequence number 
//						of the data item 12. For example if the 8th data item is the only 12, the index value 8 should be displayed for the first and last occurrence.


 
{
    public static void main(String[] args)
	{

		int count=0; 
		int num;
		int firstPos;
	    boolean lastPos;
	    lastPos = true;
		       	    
		    while(lastPos == false) 
			{
				System.out.print("\nEnter 0 to exit -> "); 		
				System.out.print("\nBegin entering your list of numbers. -> "); 
				num = EasyIn.getInt();
				
				if (num == 0)
				{
						lastPos = true;
				}
				
				count++;	
				
		    }

	}
}

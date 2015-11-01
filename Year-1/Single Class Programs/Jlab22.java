class Jlab22

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Write a program where the user enters 3 exam marks. Programming, Maths and Hardware. The program 
//                      will then calculate their average mark and indicate whether the average mark is a : Distinction, Merit, Merit2, Pass.

 
{
    public static void main(String[] args)
	{

	    double progMark;
	    double mathsMark; 
	    double hwMark; 
	    double averageMark;
					    		
		System.out.print("Enter your programming mark ->  "); 
		progMark = EasyIn.getDouble(); 
		
		System.out.print("Enter your maths mark ->  "); 
		mathsMark = EasyIn.getDouble(); 
		
		System.out.print("Enter your hardware mark ->  "); 
		hwMark = EasyIn.getDouble(); 
		
		averageMark = (progMark + mathsMark + hwMark) / 3;
		
		
		if ( averageMark >= 0 && averageMark <= 39 )
		{
			System.out.println("Sorry, You failed !"); 
		}
		else if (averageMark >= 40 && averageMark <= 53)
		{
			System.out.println("Well Done, you got a pass!"); 
		}
		else if (averageMark >= 54 && averageMark <= 62)
		{
			System.out.println("Well Done, you got a merit 2!"); 
		}		    
		else if (averageMark >= 63 && averageMark <= 69)
		{
			System.out.println("Well Done, you got a merit 1!"); 
		}	
		else if (averageMark >= 70 && averageMark <= 100)
		{
			System.out.println("Well Done, you got a distinction :D !!!"); 
		}
		else
		{
			System.out.println("Error: There was an error.");
		}
		
		System.out.println("Your average mark is ->  " + averageMark); 
		
		
	}
}

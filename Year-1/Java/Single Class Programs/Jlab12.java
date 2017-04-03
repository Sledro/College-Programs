class Jlab12 

// Student Name : 		Daniel Hayden
// Student Id Number : 	C00137009
// Date :				19/09/14
// Purpose : 			Enter the following values : distance travelled in miles, the amount of time spent on the trip in hours and the 
//                      amount of gallons of petrol used. The program should then display , the average miles per hour and the miles per gallon.

 
{
    public static void main(String[] args)
	{

	    double distance; 
		double time;  
		double gallons;
		
		double averageMPH;
		double averageMPG;
	    		
		System.out.print("Enter the distance traveled (Miles) ->  "); 
		distance = EasyIn.getDouble(); 
		System.out.print("Enter the time spent traveling (Hours) ->  "); 
		time = EasyIn.getDouble(); 
		System.out.print("Enter the amount of petrol used (Gallons) ->  "); 
		gallons = EasyIn.getDouble(); 
		
		averageMPH = distance / time;				
	    averageMPG = distance / gallons;
		 
	    System.out.println("Your average miles per hour traveled was " + averageMPH + " MPH" ); 
	    System.out.println("Your car consumed " + averageMPG + " miles per gallon." ); 
	  
	}
}

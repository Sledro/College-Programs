/**
** Author: DH         Date: November '15
**
** Description: The definition for class Time (as described in this handout) is in Time.java on 
*   			the common drive.  There is a driver program called TimeTest.java in the same 
*   			directory. Copy both these files to your account. Run the driver program. Can 
*   			you follow what is happening? If not, ask for help. Provide another driver 
*   			program Clock.java that will create a Time object - you should pass to the Time 
*   			constructor method the current time in hours and minutes. Next, write a loop 
*   			that calls method tick() every second and then prints the stored time.  The 
*   			loop (and program) should terminate when the stored time advances to the next 
*   			minute. 
*  				Hint: to find out when a second has passed you will need to use 
*  				System.currentTimeMillis() which returns the number of milliseconds elapsed 
*  				since January 1, 1970.  There are 1000 milliseconds in 1 second.
*/
// Time class definition
public class Clock
{ // begin class Clock
	   public static void main(String args[])
	   {
		    //Create object 
		    Time clock1 = new Time(11,45,03);
		    
		    long lastSec=0;
		    int counter=0;
		    
		    //60 Seconds per min, 1 second per loop, loop 60 times to move up 1 minute
		    while(counter<60){
		        long sec = System.currentTimeMillis() / 1000;
		        if (sec != lastSec) {
		           //Run every second
		        	clock1.tick();
			        System.out.println(clock1.toString());
		            lastSec = sec;
		            counter++;
		        }
		    }
	   }
} // end class Clock
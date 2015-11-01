/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: A thermometer driver
*/

public class ThermometerDriver
{ // begin class ThermTest
  public static void main(String args[]) 
  { // being main
	  
    double tempB;
    
    Thermometer thermA = new Thermometer();
    Thermometer thermB = new Thermometer(100.0);

    System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
    
    thermA.setCelsius(20.0);
    
    System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
    
    // assign return value of getCelsius to a variable
    tempB = thermB.getCelsius();
    
    System.out.println("Temp. of Thermometer B is " + tempB);
    
    tempB = thermB.getFahrenheit();
    
    	
    
    System.out.println("Temp. of Thermometer B in Far is " + tempB);
    
  } // end main
} // end class ThermTest

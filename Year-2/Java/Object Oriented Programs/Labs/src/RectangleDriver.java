/*
** Author: DH	Date: November 2015
** Purpose: Create a class Rectangle. The class has attributes length and width, each of which 
*			defaults to 1. It has methods that calculate the perimeter and the area of the 
*			rectangle. It has set() and get() methods for both length and width. The set() 
*			methods should verify that length and width are each floating point numbers larger 
*			than 0.0 and less than 20.0. Write a suitable driver program to test each of your 
*			methods in class Rectangle.
*
*/

public class RectangleDriver
{ // begin Rectangle
	  public static void main(String args[]) 
	  { // being main
		  
	    //Create object 
	    Rectangle rec1 = new Rectangle(10,40);

	    System.out.println("The getLength of rec1 is " + rec1.getLength());
	    System.out.println("The getWidth of rec1 is " + rec1.getWidth());
	    System.out.println("The Perimeter of rec1 is " + rec1.getPerimeter());
	    System.out.println("The Area of rec1 is " + rec1.getArea());

	  } // end main
} // end class Rectangle

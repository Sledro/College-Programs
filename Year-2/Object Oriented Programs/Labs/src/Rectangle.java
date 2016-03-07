/*
** Author: DH	Date: October 2015
** Purpose: Create a class Rectangle. The class has attributes length and width, each of which 
*			defaults to 1. It has methods that calculate the perimeter and the area of the 
*			rectangle. It has set() and get() methods for both length and width. The set() 
*			methods should verify that length and width are each floating point numbers larger 
*			than 0.0 and less than 20.0. Write a suitable driver program to test each of your 
*			methods in class Rectangle.
*
*/

public class Rectangle
{ // begin Rectangle
	
	private float length;
	private float width;
	
	//Constructor to set defaults values to 1
	public Rectangle() {
		length=1;
		width=1;
	}
	
	//Constructor 2 to change this class's values with the driver arguments
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		if(length>0.0 && length<20.0){
		this.length = length;
		}
	}
	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		if(width>0.0 && width<20.0){
		this.width = width;
		}
	}
	
	public float getPerimeter() {
		float perimeter;
		
		perimeter = (length*2)+(width*2);
		
		return perimeter;
	}
	
	public float getArea() {
		float area;
		
		area = (length*width);
		
		return area;
	}
} // end class Rectangle

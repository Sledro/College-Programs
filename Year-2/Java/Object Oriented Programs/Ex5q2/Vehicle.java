/*
@author DH         
Date: November '15
Purpose:
*/

public class Vehicle {
	
	private Car[] car = new Car[10];  // set an array of 10
	private  int index = 0;
	
	public void addCar(Car car){
		this.car[index] = car;  // add the employee at index pos
		index++;
	}
	
	public void getAllCars(){
		int index;
		for(index = 0; index <= car.length-1; index++){
			if(car[index] == null){
				break;  
			}
			System.out.println(car[index].toString()); // convert to readable text
			System.out.println();
		}
	}
}

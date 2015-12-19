/*
@author DH         
Date: November '15
Purpose: See Lab 5 Question 2
*/

public class Car {
	private String make;
	private String model;
	private int engineSize;
	private int engineType;
	private String regNo;
	
	//Constructor to use the first 4 variables 
	public Car(String make, String model, int engineSize, int engineType) {
		super();
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.engineType = engineType;
	}
	//Constructor to use all variables
	public Car(String make, String model, int engineSize, int engineType, String regNo) {
		super();
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.engineType = engineType;
		this.regNo = regNo;
	}
	

	//Start Getters and Setters for each variable
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	public int getEngineType() {
		return engineType;
	}
	public void setEngineType(int engineType) {
		this.engineType = engineType;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engineSize=" + engineSize + ", engineType=" + engineType
				+ ", regNo=" + regNo + "] ";
	}

	//Print the Car Object toString
	
}

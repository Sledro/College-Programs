/*
@author DH         
Date: November '15
Purpose: See Lab 5 Question 1


*/

public class Employee {
	
	int number;
	String name;
	String address;
	String department;
	double salary;
	String carReg;
	
	public Employee(){
		
	}
	/**
	 * @param number
	 * @param name
	 * @param address
	 */
	public Employee(int number, String name, String address) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
	}
	/**
	 * @param number
	 * @param name
	 * @param address
	 * @param department
	 * @param salary
	 * @param carReg
	 */
	public Employee(int number, String name, String address, String department, int salary, String carReg) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.department = department;
		this.salary = salary;
		this.carReg = carReg;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the carReg
	 */
	public String getCarReg() {
		return carReg;
	}
	/**
	 * @param carReg the carReg to set
	 */
	public void setCarReg(String carReg) {
		this.carReg = carReg;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", Address=" + address + ", Department=" + department
				+ ", salary=" + salary + ", carReg=" + carReg + "]";
	}
	//The tax rate is 20% on amounts up to �20,000 and 40% on all salary above this amount.
	public double taxPayable(double salary){
		double taxAmount = 0;
		if(salary>0&&salary<=20000){
			 taxAmount = salary*0.2;
		}else if(salary>20000){
			taxAmount = salary*0.4;
		}else{
			taxAmount=-1;
		}
		return taxAmount;	
	}
}

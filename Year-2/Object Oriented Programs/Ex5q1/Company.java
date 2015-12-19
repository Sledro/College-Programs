/*
@author DH         
Date: November '15
Purpose:
*/


public class Company 
{
	private Employee[] company = new Employee[10];  // set an array of 10
	private  int index = 0;
	
	public void addEmployee(Employee employee){
		this.company[index] = employee;  // add the employee at index pos
		index++;
	}
	
	public void getAllEmployee(){
		int index;
		for(index = 0; index <= company.length-1; index++){
			if(company[index] == null){
				break;  
			}
			System.out.println(company[index].toString()); // convert to readable text
			System.out.println();
		}
	}
}

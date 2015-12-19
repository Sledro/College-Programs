/*
@author DH         
Date: November '15
Purpose: See Lab 5 Question 1


*/
public class EmployeeDriver {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	    //Create objects using first constructor
		Employee employee1 = new Employee(3456,"Dan","12 MPC NEWBRIDGE");

		//Print out the first employee
		System.out.println(employee1.toString());
		
		//Use second
		Employee employee2 = new Employee();
		employee2.setName("Dan");
		employee2.setAddress("5 The Wells");
		employee2.setNumber(6542);
		employee2.setDepartment("Ice Development");
		employee2.setSalary(100000);
		employee2.setCarReg("09 KE 63548");
		System.out.println(employee2.toString());
		
		//Then print the amount of tax  
		System.out.println(employee2.taxPayable(employee2.getSalary()));
		
		System.out.println();
		
		Company myCo = new Company();
		myCo.addEmployee(employee1);
		myCo.addEmployee(employee2);
		myCo.getAllEmployee();

	}

}

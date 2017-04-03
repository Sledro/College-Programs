/*
@author DH         
Date: November '15
Purpose: See Lab 5 Question 1
*/

public class EmployeeDriver {

	public static void main(String[] args) {

	    //Create some car objects
		Car car1 = new Car("VW","Golf",1399,5,"08 KE 3456");
		Car car2 = new Car("Audi","A4",1999,8,"09 D 8547");
		Car car3 = new Car("BMW","225",1499,5,"08 KE 7777");
		Car car4 = new Car("Audi","A8",2299,1,"15 LM 2254");
		
		//Create a Vehicle object to manage the array of cars
		Vehicle veh = new Vehicle();
		veh.addCar(car1);
		veh.addCar(car2);
		veh.addCar(car3);
		veh.addCar(car4);
		veh.getAllCars();
		
	    //Create objects using first constructor
		Employee employee1 = new Employee(3456,"Joe","12 MPC NEWBRIDGE");

		//Print out the first employee
		System.out.println(employee1.toString());
		
		//Create an empty Employee object and fill it using the setters called employee2
		Employee employee2 = new Employee();
		employee2.setName("Dan");
		employee2.setAddress("5 The Wells");
		employee2.setNumber(6542);
		employee2.setDepartment("Ice Development");
		employee2.setSalary(100000);
		
		//Add some Cars to this Employee2 and store then in an array
		employee2.addCar(car1);
		employee2.addCar(car2);
		employee2.addCar(car3);
		
		//Print out Employee2
		System.out.println(employee2.toString());
		
		//Then print the amount of tax  
		System.out.println("Tax Due: " + employee2.taxPayable(employee2.getSalary()));
		
		System.out.println();
		
		//Create a new Company to store the Employees in Array
		Company myCo = new Company();
		myCo.addEmployee(employee1);
		myCo.addEmployee(employee2);
		myCo.getAllEmployee();

	}
}

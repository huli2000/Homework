package Lesson13;

public class Employee {

		//attributes
	private String name;
	private double salary;
	
	//constructors
	public Employee() {	
	}
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		
	}
	
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
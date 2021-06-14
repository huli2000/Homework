package Lesson12;

public class Person {

	//attributes
	
	int id;
	String name;
	
	//private int
	private int age;
	
	//to publish it
	public int getAge() {
		return age;
	}
	
	//to change it
	public void setAge(int theNewAge) {
		if (theNewAge >=0 && theNewAge <=120) {
				age = theNewAge;
						}
	}
	//methods
	
	void speak() {
		System.out.println(name + " is speaking");
	
	}
	void walk() {
		System.out.println(name + " is walking");
	}
}


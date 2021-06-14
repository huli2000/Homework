package Lesson12;

public class Person {

	//attributes
	
	private int id;
	private String name;
	private int age;
	
	//constructors
	
	public Person () {
		
	}
	
	public Person (int id, String name, int age) {
			this.id=id;
			this.name=name;
			this.age=age;
			setAge(age);
	
	}
	//methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
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


package Lesson12;

public class Application {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person (103, "David", 22);
		
		p1.setId (101);
		p1.setName ("Dan");
		p1.setAge (18);
		
		p2.setId (2323);
		p2.setName("Moshe");
		p2.setAge (25);
		
		p1.speak();
		p2.speak();
		
		p1.walk();
		p2.walk();
		
		p1.setAge(78);
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		
		System.out.println(p3.getAge());
		System.out.println(p3.getName());
		System.out.println(p3.getId());
	}
}

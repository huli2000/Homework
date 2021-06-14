package Lesson12;

public class Application {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.id = 101;
		p1.name = "Dan";
		p1.setAge (18);
		
		p2.id = 1222;
		p2.name = "Moshe";
		p2.setAge (25);
		
		p1.speak();
		p2.speak();
		
		p1.walk();
		p2.walk();
		
		p1.setAge(200);
		System.out.println(p1.getAge());
		
	}
}

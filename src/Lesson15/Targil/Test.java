package Lesson15.Targil;

public class Test {

	public static void main(String[] args) {

		
		Shape shape;
		
		shape = new Rectangle("White", 8, 5);
		System.out.println(shape.getArea());
		
		shape = new Circle("Red", 5);
		System.out.println(shape.getArea());
		
		
	}

}

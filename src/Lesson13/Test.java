package Lesson13;

public class Test {

	public static void main(String[] args) {
		
		Point p1 = new Point (2, 8);
		
		System.out.println("===============");
//			Point p2 = new Point (5);
		
		System.out.println("===============");

		Pixel px1 = new Pixel(2,4,"Red");
		System.out.println("===============");
		
		System.out.println(p1.getX());
		p1.moveRight();
		System.out.println(p1.getX());
		p1.moveRight(100);
		System.out.println(p1.getX());
		
		
		
	
		
		
	}
}

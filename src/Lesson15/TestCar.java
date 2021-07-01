package Lesson15;

public class TestCar {

	public static void main(String[] args) {
		System.out.println(Car.getCounter());
		System.out.println("Car factory address: " + Car.getAddress());
		System.out.println("Car Factory phone number: " + Car.getFactoryPhone());
		
		
		Car car1= new Car(120, "red", 250);
		Car car2= new Car(130, "blue", 280);
		Car car3= new Car(140, "yellow", 350);
		
		System.out.println(car1.getColor());
		System.out.println(Car.getCounter());
		
		System.out.println("number of cars made: " + Car.getCounter()); 
		System.out.println(car2.getColor());
		System.out.println(Car.getCounter());
		System.out.println(car3.getColor());

		System.out.println(Car.getCounter());
	}
}

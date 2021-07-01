package Lesson15;

public class Car {

	//static and dynamic
// class variable	
		static String address = "Tel-Aviv";
		static String factoryPhone = "03-4443322";

		//instance variable
		int number;
		String color;
		int speed;
		
		public Car(int number, String color, int speed) {
			super();
			this.number = number;
			this.color = color;
			this.speed = speed;
		}
		
		
		public static void main(String[] args) {
			System.out.println("Car factory address: " + Car.address);
			System.out.println("Car Factory phone number: " + Car.factoryPhone);
			
			
			Car car1= new Car(120, "red", 250);
			Car car2= new Car(130, "blue", 280);
			Car car3= new Car(140, "yellow", 350);
			
			System.out.println(car1.color);
			System.out.println(car2.color);
			System.out.println(car3.color);

		}


		
		
}
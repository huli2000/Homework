package Lesson15;

public class Car {

	
		static {
			System.out.println("===class car loaded to memory");
			
		}
		
		{
			
			System.out.println("**** car made****");
		}
	//static and dynamic
// class variable	
		private static String address = "Tel-Aviv";
		private static String factoryPhone = "03-4443322";
		private static int counter;  
		
		
		
		//instance variable
		private int number;
		private String color;
		private int speed;
		
		public Car(int number, String color, int speed) {
			super();
			this.number = number;
			this.color = color;
			this.speed = speed;
			counter++;
			
			
		}
		
		public static int getCounter() {
			return counter;
		
		}
		
		

		public static String getAddress() {
			return address;
		}

		public static void setAddress(String address) {
			Car.address = address;
		}

		public static String getFactoryPhone() {
			return factoryPhone;
		}

		public static void setFactoryPhone(String factoryPhone) {
			Car.factoryPhone = factoryPhone;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		
	

		
		
}
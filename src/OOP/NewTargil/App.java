package OOP.NewTargil;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		Highway[] highways = new Highway[10];
		String[] highwayNames = { "aaa", "bbb", "ccc", "gagasg", "gsasg" };
		Country country = new Country("Israel", genHighway(highways, highwayNames));
		System.out.println(Arrays.toString(highways));
		System.out.println("number of all cars in the country " +sumOfCars(country.getHighways()));
		int x = country.getHighways()[0].getCars().length;
		System.out.println("number of cars in each highway " + x);
		double y = avgSpeed (country);
		
		
	}

	private static double avgSpeed(Country country) {
		for (int i = 0; i < country.getHighways().length; i++) {
		Car[] cars=	country.getHighways()[i].getCars();
		
		}
		return 0;
	}

	private static int sumOfCars(Highway[] highways) {
		int sumCars = 0;
		for (int i = 0; i < highways.length; i++) {
			sumCars +=	highways[i].getCars().length;
		}
		return sumCars;
	}

	public static Highway[] genHighway(Highway[] highways, String[] highwayNames) {
		for (int i = 0; i < highways.length; i++) {
			int k = (int) (Math.random() * highwayNames.length);
			highways[i] = new Highway(highwayNames[k], popCar());
		}
		return highways;
	}

	public static Car[] popCar() {
		Car[] cars = new Car[2];
		for (int i = 0; i < cars.length; i++) {
			int plateNumber = (int) (Math.random() * 100);
			int carSpeed = (int) (Math.random() * 111);
			cars[i] = new Car(plateNumber, carSpeed);
		}
		return cars;
	}

}
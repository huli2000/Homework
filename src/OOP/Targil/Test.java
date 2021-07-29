package OOP.Targil;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

	public static void main(String[] args) {

		Country c1 = new Country("Sweden");
//		System.out.println(c1);
		Highway[] h1 = generateHighways(3);
//		System.out.println(Arrays.toString(h1));
		c1.setHighways(h1);
		System.out.println(c1);
	}

	// methods
	public static Highway[] generateHighways(int numOfHighways) {

		Highway[] highway = new Highway[numOfHighways];

		for (int i = 0; i < highway.length; i++) {

			highway[i] = new Highway(genName(5));
			
			Car[] c1 = generateCars(5);
			highway[i].setCars(c1);
		}
		return highway;

	}

	private static Car[] generateCars(int numOfCars) {
		Car[] cars = new Car[numOfCars];
		for (int i = 0; i < cars.length; i++) {
			int genNumber = ThreadLocalRandom.current().nextInt();
			int genSpeed = (int) (Math.random()*121);
			cars[i] = new Car(genNumber, genSpeed);
		}
		return cars;
	}

	public static String genName(int nameLegnth) {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < nameLegnth) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

}
package OOP.Targil;

import java.util.Arrays;

public class Highway {

	private String name;
	Car[] cars;

	public Highway(String name) {
		super();
		this.name = name;
		this.cars = new Car[5];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Highway [name=" + name + ", cars=" + Arrays.toString(cars) + "]";
	}

}
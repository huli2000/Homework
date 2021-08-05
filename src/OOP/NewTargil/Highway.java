package OOP.NewTargil;

import java.util.Arrays;

public class Highway {

	private String name;
	private Car[] cars = new Car[100];

	public Highway(String name, Car[] cars) {
		super();
		this.name = name;
		this.cars = cars;
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

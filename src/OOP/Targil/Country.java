package OOP.Targil;

import java.util.Arrays;

public class Country {

	private String name = "Israel";
	Highway[] highways = new Highway[5];
	
	public Country(String name) {
		super();
		this.name = name;
		this.highways = new Highway[5];
	}

	public Country() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Highway[] getHighways() {
		return highways;
	}

	public void setHighways(Highway[] highways) {
		this.highways = highways;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", highways=" + Arrays.toString(highways) + "]";
	}
	
	
	
}
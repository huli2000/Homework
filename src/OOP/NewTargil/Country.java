package OOP.NewTargil;

import java.util.Arrays;

public class Country {

	private String name;
	Highway[] highways = new Highway[5];
	
	
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


	public Country(String name, Highway[] highways) {
		super();
		this.name = name;
		this.highways = highways;
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", highways=" + Arrays.toString(highways) + "]";
	}
	
	
	
}

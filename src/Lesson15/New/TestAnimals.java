package Lesson15.New;

import java.util.Iterator;

public class TestAnimals {

	public static void main(String[] args) {

		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cow();
		animals[2] = new Cat();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}
		
	}

}
